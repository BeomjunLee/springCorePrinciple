package practice.springCorePrinciple;

import practice.springCorePrinciple.discount.DiscountPolicy;
import practice.springCorePrinciple.discount.FixDiscountPolicy;
import practice.springCorePrinciple.discount.RateDiscountPolicy;
import practice.springCorePrinciple.member.MemberRepository;
import practice.springCorePrinciple.member.MemberService;
import practice.springCorePrinciple.member.MemberServiceImpl;
import practice.springCorePrinciple.member.MemoryMemberRepository;
import practice.springCorePrinciple.order.OrderService;
import practice.springCorePrinciple.order.OrderServiceImpl;

public class AppConfig {

    private MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    private DiscountPolicy discountPolicy() {
//        return new FixDiscountPolicy();
        return new RateDiscountPolicy();
    }

    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    public OrderService orderService() {
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }
}
