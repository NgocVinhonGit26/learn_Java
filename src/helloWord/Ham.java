package helloWord;

public class Ham {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 45;
		int b = 5;
		System.out.println(tongHaiSo());
		System.out.println(hieuHaiSo(a, b));
	}

	public static int tongHaiSo() {
		int x = 10;
		int y = 5;
		int tong = x + y;
		return tong;
	}

	public static int hieuHaiSo(int x, int y) {
		return x - y;
	}
}
