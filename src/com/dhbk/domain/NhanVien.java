package com.dhbk.domain;

public class NhanVien extends Person {
    private int yearEXP;

    public NhanVien() {

    }

    public NhanVien(String ten, int yearEXP) {
        super(ten);
        this.yearEXP = yearEXP;
    }

    public int getYearEXP() {
        return yearEXP;
    }

    public void setYearEXP(int yearEXP) {
        this.yearEXP = yearEXP;
    }

    // @Override
    // public double luong() {
    // if (yearEXP < 1) {
    // return super.luong();
    // } else if (yearEXP < 5 && yearEXP >= 1) {
    // return super.luong() * 1.2;
    // } else {
    // return super.luong() * 1.5;
    // }
    // }

}
