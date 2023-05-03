package com.stellar.coreBasic.serviceImpl;

import com.stellar.coreBasic.entity.Member;
import com.stellar.coreBasic.repository.MemberRepository;
import com.stellar.coreBasic.service.MemberService;

public class MemberServiceImpl implements MemberService {
    private final MemberRepository memberRepository;

    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member inquiryMember(String memberName) {
        return memberRepository.findByName(memberName);
    }
}
