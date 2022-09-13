package com.dhbk.object;

public class Book {
    private String tenSach;
    private String tenNXB;
    private float giaTien;

    // contructor

    public Book() {

    }

    public Book(String tenSach, String tenNXB, float giaTien) {
        this.tenSach = tenSach;
        this.tenNXB = tenNXB;
        this.giaTien = giaTien;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getTenNXB() {
        return tenNXB;
    }

    public void setTenNXB(String tenNXB) {
        this.tenNXB = tenNXB;
    }

    public float getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(float giaTien) {
        this.giaTien = giaTien;
    }

}
