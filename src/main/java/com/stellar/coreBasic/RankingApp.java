package com.stellar.coreBasic;

import com.stellar.coreBasic.service.MemberService;

public class RankingApp {
    public static void main(String[] args) {
        AppConfig appconfig = new AppConfig();
        MemberService memberService = appconfig.memberService();
    }
}
