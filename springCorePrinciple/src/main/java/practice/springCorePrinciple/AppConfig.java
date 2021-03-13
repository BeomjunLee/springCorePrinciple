package practice.springCorePrinciple;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import practice.springCorePrinciple.discount.DiscountPolicy;
import practice.springCorePrinciple.discount.RateDiscountPolicy;
import practice.springCorePrinciple.member.MemberRepository;
import practice.springCorePrinciple.member.MemberService;
import practice.springCorePrinciple.member.MemberServiceImpl;
import practice.springCorePrinciple.member.MemoryMemberRepository;
import practice.springCorePrinciple.order.OrderService;
import practice.springCorePrinciple.order.OrderServiceImpl;

@Configuration
public class AppConfig {

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    @Bean
    public DiscountPolicy discountPolicy() {
//        return new FixDiscountPolicy();
        return new RateDiscountPolicy();
    }

    @Bean
    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public OrderService orderService() {
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }
}
