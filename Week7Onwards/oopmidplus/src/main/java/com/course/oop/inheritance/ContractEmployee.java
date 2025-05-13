package com.course.oop.inheritance;

public class ContractEmployee extends Employee{
    private double fixedSalary;

    ContractEmployee(String name, int age, String ssn, String joTitle, double fixedSalary) {
        super(name, age, ssn, joTitle);
        this.fixedSalary = fixedSalary;
    }
    public double getFixedSalary() {
        return fixedSalary;
    }
    public void setFixedSalary(double fixedSalary) {
        this.fixedSalary = fixedSalary;
    }

    @Override
    public String toString() {
        return super.toString() + ", Fixed Salary: " + fixedSalary;
    }

    @Override
    public double calculateSalary() {
        return fixedSalary;
    }
}
