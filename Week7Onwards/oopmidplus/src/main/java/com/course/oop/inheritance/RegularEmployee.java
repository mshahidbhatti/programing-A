package com.course.oop.inheritance;

public class RegularEmployee extends Employee{
    private double baseSalary;
    private double houseRent;

    public RegularEmployee(String name, int age, String ssn, String joTitle, double baseSalary, double houseRent) {
        super(name, age, ssn, joTitle);
        this.baseSalary = baseSalary;
        this.houseRent = houseRent;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getHouseRent() {
        return houseRent;
    }

    public void setHouseRent(double houseRent) {
        this.houseRent = houseRent;
    }
    @Override
    public double calculateSalary() {
        return baseSalary + houseRent;
    }

    @Override
    public String toString() {
        return super.toString()+"RegularEmployee{" +
                "baseSalary=" + baseSalary +
                ", houseRent=" + houseRent +
                '}';
    }
}
