package com.dhbk.dto;

public class Person {
    private String ten;
    private String ho;

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public void setHoten(String ho, String ten) {
        this.ho = ho;
        this.ten = ten;
    }

    public String getHoten() {
        return this.ho + " " + this.ten;
    }

}
