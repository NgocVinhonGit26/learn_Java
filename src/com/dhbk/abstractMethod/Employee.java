package com.dhbk.abstractMethod;

public class Employee extends Person {

    private int yearEXP;
    private static final int BASE_SALARY = 50000;

    public int getYearEXP() {
        return yearEXP;
    }

    public void setYearEXP(int yearEXP) {
        this.yearEXP = yearEXP;
    }

    @Override
    public double saraly() {
        // TODO Auto-generated method stub
        if (yearEXP < 5) {
            return BASE_SALARY;
        } else {
            return BASE_SALARY + (yearEXP - 5) * 10000;
        }
    }
}
