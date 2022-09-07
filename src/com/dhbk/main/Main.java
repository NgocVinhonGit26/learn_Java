package com.dhbk.main;

import java.util.Scanner;

import helloWord.HinhChuNhat;
import helloWord.HinhTron;
import helloWord.HinhVuong;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// float chieuDai = 5;
		// float chieuRong = 3;
		// float canhHinhVuong = 4;
		// float banKinh = 5;

		Scanner scan = new Scanner(System.in);
		menu();
		System.out.println("Nhap option: ");
		int choose = scan.nextInt();
		switch (choose) {
			case 1: {
				System.out.println("Nhap do dai canh hinh vuong: ");
				Float canhHinhVuong = scan.nextFloat();
				// dien tich + chu vi hinh vuong
				System.out.println("Dien tich hinh vuong la: " + HinhVuong.dienTich(canhHinhVuong));
				System.out.println("Chu vi hinh vuong la: " + HinhVuong.chuVi(canhHinhVuong));
				break;
			}
			case 2: {
				System.out.println("Nhap chieu dai cua hinh chu nhat");
				float chieuDai = scan.nextFloat();
				System.out.println("Nhap chieu rong cua hinh chu nhat");
				float chieuRong = scan.nextFloat();
				// dien tich + chu vi hinh chu nhat
				System.out.println("Dien tich hinh chu nhat la: " + HinhChuNhat.dienTich(chieuDai, chieuRong));
				System.out.println("Chu vi hinh chu nhat la: " + HinhChuNhat.chuVi(chieuDai, chieuRong));
				break;
			}
			case 3: {
				System.out.println("Nhap ban kinh cua hinh tron");
				float banKinh = scan.nextFloat();
				// dien tich + chu vi hinh tron
				System.out.println("Dien tich hinh tron la: " + HinhTron.dienTich(banKinh));
				System.out.println("Chu vi hinh tron la: " + HinhTron.chuVi(banKinh));
				break;
			}
			default: {
				System.out.println("Ket thuc chuong trinh");
			}
		}

	}

	public static void menu() {
		System.out.println("~~~~~~~~~~Options~~~~~~~~~~");
		System.out.println("1.Hinh vuong");
		System.out.println("2.Hinh chu nhat");
		System.out.println("3.Hinh tron");
		System.out.println("4.Thoat");
	}

}
