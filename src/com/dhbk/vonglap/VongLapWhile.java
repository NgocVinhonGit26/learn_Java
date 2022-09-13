package com.dhbk.vonglap;

public class VongLapWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;
		while (i > 0) {
			System.out.println(i);
			--i;
		}

		System.out.println("----------------");

		int[] mang = { 1, 2, 3, 4, 5, 6 };
		int tmp = 0;
		while (tmp < mang.length) {
			System.out.println(mang[tmp]);
			tmp++;
		}

		System.out.println("----------------");

		int index = 0;
		do {
			System.out.println(index);
			index++;
		} while (index < 5);
	}

}
