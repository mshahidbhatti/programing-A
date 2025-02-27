package model;
public class Person{

	public String name;

	public Person(String name){
		this.name=name;
	}

	public void display(){
		System.out.println("The name of person:"+name);
	}

}