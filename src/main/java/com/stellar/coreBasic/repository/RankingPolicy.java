package com.stellar.coreBasic.repository;

import com.stellar.coreBasic.entity.Member;

import java.util.List;

public interface RankingPolicy {
    int ranking(Member member, List<Member> memberList);
}
