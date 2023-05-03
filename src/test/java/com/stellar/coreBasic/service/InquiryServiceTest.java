package com.stellar.coreBasic.service;

import com.stellar.coreBasic.entity.HighSchoolGrade;
import com.stellar.coreBasic.entity.Inquiry;
import com.stellar.coreBasic.entity.Member;
import com.stellar.coreBasic.serviceImpl.InquiryServiceImpl;
import com.stellar.coreBasic.serviceImpl.MemberServiceImpl;
import org.junit.jupiter.api.Test;

class InquiryServiceTest {
    MemberService memberService = new MemberServiceImpl();
    InquiryService inquiryService = new InquiryServiceImpl();

    @Test
    void createInquiry() {
        Member member = new Member("kang", 85.0, 5, 99.6, HighSchoolGrade.SENIOR);
        memberService.join(member);

        Inquiry inquiry = inquiryService.createInquiry("kang", 1);
        org.assertj.core.api.Assertions.assertThat(inquiry.getRank()).isEqualTo(2);
    }
}