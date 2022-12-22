package com.dhbk.dinhdang;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

public class DInhDangTienTe {
    // main

    public static void main(String[] args) {
        long l = 123456789;
        double d = 123456789.123456789;

        Locale locale = new Locale("vi", "VN");
        NumberFormat format = NumberFormat.getCurrencyInstance(locale);

        format.setRoundingMode(RoundingMode.HALF_UP);
        System.out.println(format.format(l));
        System.out.println(format.format(d));

        DecimalFormat format2 = (DecimalFormat) DecimalFormat.getCurrencyInstance(locale);
        System.out.println(format2.format(d));

        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setGroupingSeparator('-');
        symbols.setCurrencySymbol("vnd");
        format2.setDecimalFormatSymbols(symbols);
        System.out.println(format2.format(l));

        NumberFormat percentFormat = NumberFormat.getPercentInstance();
        System.out.println(percentFormat.format(0.1));
    }
}
