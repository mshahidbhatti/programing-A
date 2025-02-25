package main;
import util.Maths;
import model.Book;
import java.util.Scanner;
import java.io.Console;

public class Main{

	public static void main(String args[]){

		Console console=System.console();

		String user="admin";
		String password="123";
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter user:");
		sc.next();
		System.out.print("Enter pasword:");
		console.readPassword();
	

		Maths obj=new Maths();

		System.out.println(obj.sum(2,3));

		Book b1 = new Book();

		System.out.println(b1.name);
		System.err.println("this message is errstd");

		

	}


}