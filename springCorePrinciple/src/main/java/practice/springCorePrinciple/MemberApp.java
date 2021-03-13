package practice.springCorePrinciple;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import practice.springCorePrinciple.member.Grade;
import practice.springCorePrinciple.member.Member;
import practice.springCorePrinciple.member.MemberService;

public class MemberApp {
    public static void main(String[] args) {
//        private AppConfig appConfig = new AppConfig();
//        private final MemberService memberService = appConfig.memberService();

        //AppConfig 에 있는 환경설정 정보를 가지고 스프링 컨테이너에 객체를 생성해 관리
        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        MemberService memberService = ac.getBean("memberService", MemberService.class);

        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(1L);
        System.out.println("new member = " + member.getName());
        System.out.println("findMember = " + findMember.getName());

    }
}
