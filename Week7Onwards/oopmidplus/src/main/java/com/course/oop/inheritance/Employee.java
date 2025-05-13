package com.course.oop.inheritance;

public class Employee extends Person{
    private String ssn;
    private String joTitle;

    public Employee() {

    }

    Employee(String name, int age, String ssn, String joTitle){

        super(name, age); // this must be first statement
        //this();
       this.ssn = ssn;
       this.joTitle = joTitle;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getJoTitle() {
        return joTitle;
    }

    public void setJoTitle(String joTitle) {
        this.joTitle = joTitle;
    }

    @Override
    public String toString() {
        //return super.toString()+"SSN: " + ssn+"joTitle: " + joTitle;
        return String.format("%s \t %s \t %s ", super.toString(),ssn,joTitle);
    }

    public double calculateSalary(){
        return 0;
    }
}
