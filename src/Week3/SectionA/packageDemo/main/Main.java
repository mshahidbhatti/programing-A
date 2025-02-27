package main;
import util.Compare;
import util.Temp;
import model.*;
import java.util.Scanner;
import math1.Maths;
import java.io.Console;

public class Main{

	public static void main(String args[]){

		

		Temp t=Temp.console() ;// new Temp();

		Temp.InnerClass t1= t.new InnerClass();
		t1.print();

		String name="admin";
		String pasword="1234";
		//Console console= new Console();


		Scanner sc=new Scanner(System.in);
		System.out.print("Enter username:");
			sc.next();
		
		System.out.print("Enter password:");
			//console.readPassword();
		

		System.out.println("Main class");
		Compare compare =new Compare();

		Maths obj=new Maths();

		System.out.println("Minimum Number: "+compare.findMin(5,6));
	

		System.out.println(compare.PI);

		Person person1=new Person("name");
}


}