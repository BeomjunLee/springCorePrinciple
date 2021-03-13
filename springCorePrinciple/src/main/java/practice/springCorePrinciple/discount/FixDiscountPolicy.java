package practice.springCorePrinciple.discount;

import practice.springCorePrinciple.member.Grade;
import practice.springCorePrinciple.member.Member;

//정액 할인
public class FixDiscountPolicy implements DiscountPolicy{

    private int discountFixAmount = 1000;   //천원 고정 할인


    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP)
            return discountFixAmount;
        return 0;
    }
}
