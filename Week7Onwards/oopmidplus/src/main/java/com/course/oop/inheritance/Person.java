package com.course.oop.inheritance;

public class Person {
    private String name;
    private int age;

    public Person() {
        System.out.println("Default constructor of Person");
    }

    public Person(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return String.format("%s %d \n",name,age);
    }
}
