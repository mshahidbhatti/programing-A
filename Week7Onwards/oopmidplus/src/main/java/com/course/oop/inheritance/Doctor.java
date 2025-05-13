package com.course.oop.inheritance;
public class Doctor extends Employee{
    Doctor(){
        this("Doctor",23,"adsf","admin");
        System.out.println("inside default");
    }
    public Doctor(String name, int age, String ssn, String joTitle) {
        super(name, age, ssn, joTitle);
        System.out.println("inside parameter");
    }
}
