package com.stellar.coreBasic.member;

public interface MemberService {
    void join(Member member);
    Member inquiryMember(String memberName);
}
