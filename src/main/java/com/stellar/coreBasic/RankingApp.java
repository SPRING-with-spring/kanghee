package com.stellar.coreBasic;

import com.stellar.coreBasic.entity.HighSchoolGrade;
import com.stellar.coreBasic.entity.Inquiry;
import com.stellar.coreBasic.entity.Member;
import com.stellar.coreBasic.service.InquiryService;
import com.stellar.coreBasic.service.MemberService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RankingApp {
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        MemberService memberService = ac.getBean("memberService", MemberService.class);
        InquiryService inquiryService = ac.getBean("inquiryService", InquiryService.class);

        Member memberA = new Member("kang", 85.0, 5, 99.6, HighSchoolGrade.SENIOR);
        Member memberB = new Member("hee", 15.0, 1, 90.9, HighSchoolGrade.SENIOR);
        memberService.join(memberA);
        memberService.join(memberB);

        Inquiry inquiryA = inquiryService.createInquiry("kang", 1);
        Inquiry inquiryB = inquiryService.createInquiry("hee", 1);
        System.out.println("kang's rank = " + inquiryA.getRank());
        System.out.println("hee's rank = " + inquiryB.getRank());
    }
}
