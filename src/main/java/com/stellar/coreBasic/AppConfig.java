package com.stellar.coreBasic;

import com.stellar.coreBasic.repositoryImpl.GradeRankingPolicy;
import com.stellar.coreBasic.repositoryImpl.MemoryMemberRepository;
import com.stellar.coreBasic.service.InquiryService;
import com.stellar.coreBasic.service.MemberService;
import com.stellar.coreBasic.serviceImpl.InquiryServiceImpl;
import com.stellar.coreBasic.serviceImpl.MemberServiceImpl;

public class AppConfig {

    public MemberService memberService(){
        return new MemberServiceImpl(new MemoryMemberRepository());
    }

    public InquiryService inquiryService(){
        return new InquiryServiceImpl(new MemoryMemberRepository(), new GradeRankingPolicy());
    }
}
