package com.stellar.coreBasic.service;

import com.stellar.coreBasic.entity.Member;

public interface MemberService {
    void join(Member member);
    Member inquiryMember(String memberName);
}
