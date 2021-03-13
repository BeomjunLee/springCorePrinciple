package practice.springCorePrinciple.order;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import practice.springCorePrinciple.AppConfig;
import practice.springCorePrinciple.member.Grade;
import practice.springCorePrinciple.member.Member;
import practice.springCorePrinciple.member.MemberService;
import practice.springCorePrinciple.member.MemberServiceImpl;

import static org.junit.jupiter.api.Assertions.*;

class OrderServiceTest {
    private AppConfig appConfig = new AppConfig();
    private final MemberService memberService = appConfig.memberService();
    private final OrderService orderService = appConfig.orderService();

    @Test
    @DisplayName("주문 생성")
    public void createOrder() {
        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);

        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);

    }
}