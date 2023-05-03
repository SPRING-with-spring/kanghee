package com.stellar.coreBasic;

import com.stellar.coreBasic.repository.MemberRepository;
import com.stellar.coreBasic.repository.RankingPolicy;
import com.stellar.coreBasic.repositoryImpl.GradeRankingPolicy;
import com.stellar.coreBasic.repositoryImpl.MemoryMemberRepository;
import com.stellar.coreBasic.service.InquiryService;
import com.stellar.coreBasic.service.MemberService;
import com.stellar.coreBasic.serviceImpl.InquiryServiceImpl;
import com.stellar.coreBasic.serviceImpl.MemberServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public MemberService memberService(){
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public InquiryService inquiryService(){
        return new InquiryServiceImpl(memberRepository(), rankingPolicy());
    }

    @Bean
    public MemberRepository memberRepository(){
        return new MemoryMemberRepository();
    }

    @Bean
    public RankingPolicy rankingPolicy(){
        return new GradeRankingPolicy();
    }
}
