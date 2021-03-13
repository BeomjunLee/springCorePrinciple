package practice.springCorePrinciple;

import practice.springCorePrinciple.member.Grade;
import practice.springCorePrinciple.member.Member;
import practice.springCorePrinciple.member.MemberService;
import practice.springCorePrinciple.member.MemberServiceImpl;

public class MemberApp {

    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(1L);
        System.out.println("member = " + member.getName());
        System.out.println("findMember = " + findMember.getName());
    }
}
