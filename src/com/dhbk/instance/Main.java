package com.dhbk.instance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();

		if (p instanceof Worker) {
			System.out.println("p la Worker");
		} else {
			System.out.println("p khong phai Worker");
		}
	}

}
