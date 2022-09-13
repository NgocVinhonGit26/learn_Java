package com.dhbk.object;

public class Nguoi {

	String ten;
	String diachi;
	int tuoi;

	public void diLai(String ten) {
		System.out.println(ten + "di lai");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Nguoi(); // doi tuong 1
		Nguoi anhA = new Nguoi(); // doi tuong 2
		Nguoi anhB = new Nguoi(); // doi tuong 3

		anhA.diLai("anh A");
		anhB.diLai("anh B");
		anhA.diLai(anhA.ten);
	}

}
