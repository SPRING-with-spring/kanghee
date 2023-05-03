package com.stellar.coreBasic.serviceImpl;

import com.stellar.coreBasic.entity.Inquiry;
import com.stellar.coreBasic.entity.Member;
import com.stellar.coreBasic.repository.MemberRepository;
import com.stellar.coreBasic.repository.RankingPolicy;
import com.stellar.coreBasic.repositoryImpl.GradeRankingPolicy;
import com.stellar.coreBasic.repositoryImpl.MemoryMemberRepository;
import com.stellar.coreBasic.service.InquiryService;

import java.util.List;

public class InquiryServiceImpl implements InquiryService {
    private final MemberRepository memberRepository = new MemoryMemberRepository();
    private final RankingPolicy rankingPolicy = new GradeRankingPolicy();
    @Override
    public Inquiry createInquiry(String memberName, int rankingPolicyIndex) {
        Member member = memberRepository.findByName(memberName);
        int rank = 0;
        if(rankingPolicyIndex == 1){
            rank = rankingPolicy.ranking(member, memberRepository.getMemberList());
        }
        return new Inquiry(member, rank);
    }
}
