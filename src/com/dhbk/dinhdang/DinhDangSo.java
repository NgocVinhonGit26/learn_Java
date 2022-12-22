package com.dhbk.dinhdang;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class DinhDangSo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long soNguyen = 123456789;
		double soThuc = 123456789.123456789;

		Locale locale = new Locale("vi", "VN");
		NumberFormat format = NumberFormat.getInstance(locale);

		format.setMaximumFractionDigits(5);
		System.out.println(format.format(soNguyen));
		System.out.println(format.format(soThuc));

		String patern = "###,###.####";
		// DecimalFormat decimalFormat = new DecimalFormat(patern);

		DecimalFormat decimalFormat = (DecimalFormat) DecimalFormat.getInstance(locale);
		System.out.println(decimalFormat.format(soNguyen));
		System.out.println(decimalFormat.format(soThuc));
	}

}
