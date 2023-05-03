package com.stellar.coreBasic.service;

import com.stellar.coreBasic.entity.Inquiry;

public interface InquiryService {
    Inquiry createInquiry(String memberName, int rankingPolicy);
}
