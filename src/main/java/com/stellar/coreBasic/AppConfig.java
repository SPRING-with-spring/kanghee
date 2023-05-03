package com.stellar.coreBasic;

import com.stellar.coreBasic.repository.MemberRepository;
import com.stellar.coreBasic.repository.RankingPolicy;
import com.stellar.coreBasic.repositoryImpl.GradeRankingPolicy;
import com.stellar.coreBasic.repositoryImpl.MemoryMemberRepository;
import com.stellar.coreBasic.service.InquiryService;
import com.stellar.coreBasic.service.MemberService;
import com.stellar.coreBasic.serviceImpl.InquiryServiceImpl;
import com.stellar.coreBasic.serviceImpl.MemberServiceImpl;

public class AppConfig {

    public MemberService memberService(){
        return new MemberServiceImpl(memberRepository());
    }

    public InquiryService inquiryService(){
        return new InquiryServiceImpl(memberRepository(), rankingPolicy());
    }

    public MemberRepository memberRepository(){
        return new MemoryMemberRepository();
    }

    public RankingPolicy rankingPolicy(){
        return new GradeRankingPolicy();
    }
}
