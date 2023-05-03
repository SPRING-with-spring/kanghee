package com.stellar.coreBasic.repository;

import com.stellar.coreBasic.entity.Member;

import java.util.List;

public interface MemberRepository {

    void save(Member member);

    Member findByName(String memberName);
    List<Member> getMemberList();
}
