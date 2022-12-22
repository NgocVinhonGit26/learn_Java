package com.dhbk.service;

public class EmployeeServiceImpl implements Employee, AnimalsService {

    @Override
    public void them() {
        // TODO Auto-generated method stub

    }

    @Override
    public void sua() {
        // TODO Auto-generated method stub

    }

    @Override
    public void xoa() {
        // TODO Auto-generated method stub

    }

    @Override
    public void luong() {
        // TODO Auto-generated method stub
        System.out.println("luong");

    }

    // main
    public static void main(String[] args) {
        Employee emp = new EmployeeServiceImpl();
        AnimalsService p = new EmployeeServiceImpl();
        emp.luong();
    }
}
