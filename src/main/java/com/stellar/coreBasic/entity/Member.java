package com.stellar.coreBasic.entity;

public class Member {
    private String name;
    private Double score;
    private Integer grade;
    private Double rate;
    private HighSchoolGrade highSchoolGrade;

    public Member(String name, Double score, Integer grade, Double rate, HighSchoolGrade highSchoolGrade) {
        this.name = name;
        this.score = score;
        this.grade = grade;
        this.rate = rate;
        this.highSchoolGrade = highSchoolGrade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public HighSchoolGrade getHighSchoolGrade() {
        return highSchoolGrade;
    }

    public void setHighSchoolGrade(HighSchoolGrade highSchoolGrade) {
        this.highSchoolGrade = highSchoolGrade;
    }
}
