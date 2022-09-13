
package com.dhbk.mang;

import java.util.Scanner;

public class ThaoTacVoiMang {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] mang = new int[5];
        System.out.println("Nhap phan tu mang");
        for (int i = 0; i < mang.length; i++) {
            mang[i] = scan.nextInt();
        }

        for (int x : mang) {
            System.out.println(x);
        }

        // sap xep mang tang dan
        System.out.println("Mang sap xep theo thu tu tang dan");
        for (int i = 0; i < mang.length - 1; i++) {
            int tmp = mang[i];
            for (int j = i + 1; j < mang.length; j++) {
                if (mang[i] > mang[j]) {
                    mang[i] = mang[j];
                    mang[j] = tmp;
                    tmp = mang[i];
                }
            }
        }

        for (int x : mang) {
            System.out.println(x);
        }

        // sap xep mang gaim dan
        System.out.println("Mang sap xep theo thu tu giam dan");
        for (int i = 0; i < mang.length - 1; i++) {
            int tmp = mang[i];
            for (int j = i + 1; j < mang.length; j++) {
                if (mang[i] < mang[j]) {
                    mang[i] = mang[j];
                    mang[j] = tmp;
                    tmp = mang[i];
                }
            }
        }

        for (int x : mang) {
            System.out.println(x);
        }
    }
}
