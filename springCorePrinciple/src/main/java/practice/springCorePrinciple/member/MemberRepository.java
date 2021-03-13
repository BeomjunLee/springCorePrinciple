package practice.springCorePrinciple.member;

public interface MemberRepository {

    /**
     * 회원 저장
     */
    void save(Member member);

    /**
     * 회원 찾기
     * @param memberId 회원 고유 id
     * @return 회원 객체
     */
    Member findById(Long memberId);
}
