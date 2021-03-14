package practice.springCorePrinciple.discount;

import org.springframework.stereotype.Component;
import practice.springCorePrinciple.member.Grade;
import practice.springCorePrinciple.member.Member;

@Component
public class RateDiscountPolicy implements DiscountPolicy{

    private int discountRate = 10;

    @Override
    public int discount(Member member, int price) {
        if(member.getGrade() == Grade.VIP)
            return price * discountRate / 100;
        return 0;
    }
}
