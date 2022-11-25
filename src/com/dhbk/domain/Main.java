package com.dhbk.domain;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// NhanVien[] nv = new NhanVien[3];

		Worker w = new Worker(); // tinhs da hinh
		NhanVien nv = new Worker();
		Person p = new Worker();
		Object o = new Worker();

		w.luong();
		Worker w1 = (Worker) nv;// ep kieu tu nhan vien sang cong nhan
		w1.luong();

		((Worker) nv).luong();// ep kieu tat tu nhan vien sang cong nhan
		((Worker) p).luong();
		((Worker) o).luong();

		// Scanner sc = new Scanner(System.in);
		// System.out.println("Nhap thong tin 3 nhan vien: ");
		// for (int i = 0; i < nv.length; i++) {
		// System.out.println("Nhap thong tin nhan vien thu " + (i + 1));
		// String tenDuong = sc.nextLine();
		// String ten = sc.nextLine();
		// int yearEXP = sc.nextInt();

		// Address add = new Address(tenDuong);
		// NhanVien nhanVien = new NhanVien(ten, yearEXP);
		// nhanVien.setDiaChi(add);
		// nv[i] = nhanVien;
		// sc.nextLine();
		// }

		// System.out.println("Thong tin 3 nhan vien: ");
		// for (int i = 0; i < nv.length; i++) {
		// System.out.println("Nhan vien thu " + (i + 1) + ": ");
		// System.out.println("Ten: " + nv[i].getTen());
		// System.out.println("Dia chi: " + nv[i].getDiaChi().getTenDuong());
		// System.out.println("So nam kinh nghiem: " + nv[i].getYearEXP());
		// System.out.println("Luong: " + nv[i].luong());
		// }
		// nv.setTen("Phung Ngoc Vinh");
		// // nv.setDiaChi("Ha Noi");
		// nv.setLuong(4500000);
		// nv.mucLuong();
	}

}
