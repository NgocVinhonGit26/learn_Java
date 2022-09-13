package com.dhbk.vonglap;

public class VongLapFor {
    public static void main(String[] args) {
        // for
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        System.out.println("------------");

        // for_each

        int[] mang = { 789, 45, 78, 45, 12, 45, 65 };

        for (int ptu : mang) {
            System.out.println(ptu);
        }
    }
}
