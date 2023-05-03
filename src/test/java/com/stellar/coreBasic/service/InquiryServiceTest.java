package com.stellar.coreBasic.service;

import com.stellar.coreBasic.AppConfig;
import com.stellar.coreBasic.entity.HighSchoolGrade;
import com.stellar.coreBasic.entity.Inquiry;
import com.stellar.coreBasic.entity.Member;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class InquiryServiceTest {
    MemberService memberService;
    InquiryService inquiryService;

    @BeforeEach
    public void beforeEach() {
        AppConfig appconfig = new AppConfig();
        memberService = appconfig.memberService();
        inquiryService = appconfig.inquiryService();
    }

    @Test
    void createInquiry() {
        Member member = new Member("kang", 85.0, 5, 99.6, HighSchoolGrade.SENIOR);
        memberService.join(member);

        Inquiry inquiry = inquiryService.createInquiry("kang", 1);
        org.assertj.core.api.Assertions.assertThat(inquiry.getRank()).isEqualTo(2);
    }
}