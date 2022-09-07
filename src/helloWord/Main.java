package helloWord;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float chieuDai = 5;
		float chieuRong = 3;
		float canhHinhVuong = 4;
		float banKinh = 5;

		// dien tich + chu vi hinh vuong
		System.out.println("Dien tich hinh vuong la: " + HinhVuong.dienTich(canhHinhVuong));
		System.out.println("Chu vi hinh vuong la: " + HinhVuong.chuVi(canhHinhVuong));

		// dien tich + chu vi hinh chu nhat
		System.out.println("Dien tich hinh chu nhat la: " + HinhChuNhat.dienTich(chieuDai, chieuRong));
		System.out.println("Chu vi hinh chu nhat la: " + HinhChuNhat.chuVi(chieuDai, chieuRong));

		// dien tich + chu vi hinh tron
		System.out.println("Dien tich hinh tron la: " + HinhTron.dienTich(banKinh));
		System.out.println("Chu vi hinh tron la: " + HinhTron.chuVi(banKinh));
	}

}
