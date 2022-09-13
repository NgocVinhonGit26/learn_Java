package com.dhbk.thuchanh;

import java.util.Scanner;

public class PhuongTrinhBac2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.println("Nhap he so bac 2");
		float a = scan.nextInt();
		System.out.println("Nhap he so bac 1");
		float b = scan.nextInt();
		System.out.println("Nhap he so tu do");
		float c = scan.nextInt();

		if (a == 0) {
			System.out.println("Phuong trinh co nghiem duy nhat x = " + -c / b);
		} else {
			float delta = b * b - 4 * a * c;

			if (delta < 0) {
				System.out.println("Phuong trinh vo nghiem");
			} else {
				if (delta == 0) {
					System.out.println("Phuong trinh co nghiem kep x1 = x2 = " + (-b / (2 * a)));
				} else {
					if (delta > 0) {
						System.out.println("Phuong trinh co 2 nghiem phan biet:");
						System.out.println("x1 = " + ((-b + Math.sqrt(delta)) / (2 * a)));
						System.out.println("x2 = " + ((-b - Math.sqrt(delta)) / (2 * a)));
					}
				}
			}
		}

	}

}
