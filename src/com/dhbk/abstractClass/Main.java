package com.dhbk.abstractClass;

public class Main {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // Person p = new Person();

        Employee e = new Employee();
        e.setName("Phung Ngoc Vinh");
        e.setSalary(1000000);

        Person p = new Employee();
        p.setName("Phung Ngoc Vinh 2");
        ((Employee) p).setSalary(2000000);

        System.out.println(e.getName() + " " + e.getSalary());
        System.out.println(p.getName() + " " + ((Employee) p).getSalary());

    }
}
