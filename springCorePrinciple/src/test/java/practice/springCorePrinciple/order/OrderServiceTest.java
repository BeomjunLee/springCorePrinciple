package practice.springCorePrinciple.order;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import practice.springCorePrinciple.member.Grade;
import practice.springCorePrinciple.member.Member;
import practice.springCorePrinciple.member.MemberService;
import practice.springCorePrinciple.member.MemberServiceImpl;

import static org.junit.jupiter.api.Assertions.*;

class OrderServiceTest {

    MemberService memberService = new MemberServiceImpl();
    OrderService orderService = new OrderServiceImpl();

    @Test
    public void createOrder() {
        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);

        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);

    }
}