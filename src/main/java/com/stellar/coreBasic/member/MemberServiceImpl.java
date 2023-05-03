package com.stellar.coreBasic.member;

public class MemberServiceImpl implements MemberService{
    private final MemberRepository memberRepository = new MemoryMemberRepository();
    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member inquiryMember(String memberName) {
        return memberRepository.findByName(memberName);
    }
}
