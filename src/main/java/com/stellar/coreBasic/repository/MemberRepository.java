package com.stellar.coreBasic.repository;

import com.stellar.coreBasic.entity.Member;

public interface MemberRepository {

    void save(Member member);

    Member findByName(String memberName);
}
