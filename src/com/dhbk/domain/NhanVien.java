package com.dhbk.domain;

public class NhanVien extends Person {
    private double luong;

    public NhanVien() {

    }

    public NhanVien(double luong) {
        super();
        this.luong = luong;
    }

    public NhanVien(String ten) {
        super(ten);
    }

    public NhanVien(String ten, double luong) {
        super(ten);
        this.luong = luong;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public void mucLuong() {
        System.out.println(luong);
    }
}
