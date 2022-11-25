package com.dhbk.domain;

public class Person {

    private final double LUONG_CO_BAN = 1000000;

    private String ten;
    private Address diaChi;

    public Person() {

    }

    public Person(String ten) {
        super();
        this.ten = ten;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Address getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(Address diaChi) {
        this.diaChi = diaChi;
    }

    // public double luong() {
    // return LUONG_CO_BAN;
    // }

}
