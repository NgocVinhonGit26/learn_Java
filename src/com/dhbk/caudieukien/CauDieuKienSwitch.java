package com.dhbk.caudieukien;

import java.util.Scanner;

public class CauDieuKienSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhap du lieu:");
		int x = scan.nextInt();

		switch (x) {
			case 1: {
				System.out.println("x = 1");
				break;
			}
			case 2: {
				System.out.println("x = 2");
				break;
			}
			case 3: {
				System.out.println("x = 3");
				break;
			}
			case 4: {
				System.out.println("x = 4");
				break;
			}
			default: {
				System.out.println("x khong xac dinh");
			}
		}
	}

}
