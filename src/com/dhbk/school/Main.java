package com.dhbk.school;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student st = new Student();
        Teacher tc = new Teacher();

        input(st);
        input(tc);
        infor(st);
        infor(tc);
    }

    public static void infor(Person p) {
        System.out.println(p.getName());
        System.out.println(p.getAge());

        if (p instanceof Student) {
            System.out.println(((Student) p).getclasss());
        }
        if (p instanceof Teacher) {
            System.out.println(((Teacher) p).getfaculty());
        }
    }

    public static void input(Person p) {
        System.out.println("Nhap ten: ");
        p.setName(new Scanner(System.in).nextLine());
        System.out.println("Nhap tuoi: ");
        p.setAge(new Scanner(System.in).nextInt());

        if (p instanceof Student) {
            System.out.println("Nhap lop: ");
            ((Student) p).setclasss(new Scanner(System.in).nextLine());
        }
        if (p instanceof Teacher) {
            System.out.println("Nhap khoa: ");
            ((Teacher) p).setfaculty(new Scanner(System.in).nextLine());
        }
    }
}
