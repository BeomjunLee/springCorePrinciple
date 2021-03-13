package practice.springCorePrinciple.order;

import practice.springCorePrinciple.discount.DiscountPolicy;
import practice.springCorePrinciple.discount.FixDiscountPolicy;
import practice.springCorePrinciple.member.Member;
import practice.springCorePrinciple.member.MemberRepository;
import practice.springCorePrinciple.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService{

    private final MemberRepository memberRepository = new MemoryMemberRepository();
    private final DiscountPolicy discountPolicy = new FixDiscountPolicy();

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
