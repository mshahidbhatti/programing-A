package com.course.oop.inheritance;

public class CommissionEmployee extends ContractEmployee{
    private double sales;
    private double commissionRate;

    public CommissionEmployee(String name, int age, String ssn, String joTitle, double fixedSalary, double sales, double commissionRate) {
        super(name, age, ssn, joTitle, fixedSalary);
        this.sales = sales;
        this.commissionRate = commissionRate;
    }

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    @Override
    public String toString() {
        return super.toString()+" CommissionEmployee{" +
                "sales=" + sales +
                ", commissionRate=" + commissionRate +
                '}';
    }
    @Override
    public double calculateSalary() {
        return super.calculateSalary() + (sales * commissionRate);
    }
}
