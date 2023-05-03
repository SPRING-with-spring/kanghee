package com.stellar.coreBasic.member;

public interface MemberRepository {

    void save(Member member);

    Member findByName(String memberName);
}
