package com.dhbk.caudieukien;

import java.util.Scanner;

public class CauDieuKien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.println("Nhap gia tri: ");
		int x = scan.nextInt();

		// cau dieu kien
		if (x > 5) {
			System.out.println("Gia tri nhap vao lon hon 5");
		} else {
			System.out.println("Gia tri nhap vao nho hon 5");
		}
	}

}
