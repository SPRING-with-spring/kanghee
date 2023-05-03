package com.stellar.coreBasic.member;

public class Member {
    private String name;
    private Long score;
    private Integer grade;
    private Long rate;

    public Member(String name, Long score, Integer grade, Long rate) {
        this.name = name;
        this.score = score;
        this.grade = grade;
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getScore() {
        return score;
    }

    public void setScore(Long score) {
        this.score = score;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Long getRate() {
        return rate;
    }

    public void setRate(Long rate) {
        this.rate = rate;
    }
}
