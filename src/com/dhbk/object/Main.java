package com.dhbk.object;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persion p1 = new Persion();
		Persion p2 = new Persion();

		Book book1 = new Book("De men phuu luu ki", "NXB Tuoi Tre", 2.5f);
		Book book2 = new Book("Tat den", "NXB Giao duc", 5.2f);

		p1.setTen("Vinh");
		p2.setTen("Dieu");
		System.out.println(p1.getTen() + " <3 " + p2.getTen());

		System.out.println("Cac loai sach");
		System.out.println("Ten sach" + "\tNXB" + "\tGia tien");
		System.out.println(book1.getTenSach() + "\t" + book1.getTenNXB() + "\t" + book1.getGiaTien());
		System.out.println(book2.getTenSach() + "\t" + book2.getTenNXB() + "\t" + book2.getGiaTien());
	}

}
