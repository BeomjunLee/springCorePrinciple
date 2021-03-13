package practice.springCorePrinciple.discount;

import practice.springCorePrinciple.member.Member;

//할인 정책 인터페이스
public interface DiscountPolicy {

    /**
     * 할인
     * @param member 회원 객체
     * @param price 주문 금액
     * @return 할인 대상 금액
     */
    int discount(Member member, int price);
}
