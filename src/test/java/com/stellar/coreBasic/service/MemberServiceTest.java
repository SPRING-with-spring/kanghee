package com.stellar.coreBasic.service;

import com.stellar.coreBasic.AppConfig;
import com.stellar.coreBasic.entity.HighSchoolGrade;
import com.stellar.coreBasic.entity.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {
    MemberService memberService;

    @BeforeEach
    public void beforeEach(){
        AppConfig appconfig = new AppConfig();
        memberService = appconfig.memberService();
    }

    @Test
    void join() {
        //given
        Member member = new Member("kanghee", 80.5, 2, 91.1, HighSchoolGrade.SENIOR);

        //when
        memberService.join(member);
        Member findMember = memberService.inquiryMember("kanghee");

        //then
        Assertions.assertThat(member).isEqualTo(findMember);
    }
}
