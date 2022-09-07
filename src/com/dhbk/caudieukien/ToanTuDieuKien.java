package com.dhbk.caudieukien;

import java.util.Scanner;

public class ToanTuDieuKien {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Nhap du lieu: ");
        int x = scan.nextInt();
        int check = 0;

        check = ((x % 5) == 0) ? (check = 1) : (check = 0);

        // if (check == 1)
        // System.out.println("x chia het cho 5");
        // else
        // System.out.println("x khong chia het cho 5");

        String s = ((x % 5) == 0) ? "x chia het cho 5" : "x khong chia het cho 5";
        System.out.println(s);

    }
}
