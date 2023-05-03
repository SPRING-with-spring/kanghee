package com.stellar.coreBasic.entity;

public class Inquiry {
    private Member member;
    private int rank;

    public Inquiry(Member member, int rank) {
        this.member = member;
        this.rank = rank;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(Integer rankingPolicy) {
        this.rank = rankingPolicy;
    }
}
