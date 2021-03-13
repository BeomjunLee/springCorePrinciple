package practice.springCorePrinciple.member;

public interface MemberService {

    /**
     * 회원 가입
     * @param member 회원 객체
     */
    void join(Member member);

    /**
     * 회원 조회
     * @param memberId 회원 고유 id
     * @return 회원 객체
     */
    Member findMember(Long memberId);
}
