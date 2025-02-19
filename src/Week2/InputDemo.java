import java.util.Scanner;


public class InputDemo{

	public static void main(String args[]){


		Scanner input= new Scanner(System.in);

		System.out.println("This is input demo code");

		// integer primitive types
		byte b=1;
		short s=123;
		int i=1000;
		long l=23424;

		System.out.print("Enter byte value: ");
		b = input.nextByte();

		System.out.print("Enter byte short: ");
		s = input.nextShort();

		// types with decimal values
		float f=10.0f;
		System.out.print("Enter byte float: ");
		f = input.nextFloat();

		double d=1000000.00;
		double d1=100000000.00;

		// for char
		char c='\n';
		//System.out.print("Enter byte char: ");
		//c = input.nextChar();


		// for binary values

		boolean bool=true;

		System.out.print("Enter byte value: ");
		bool = input.nextBoolean();


		System.out.printf(" Value in byte :\t%04d \n", b);

		System.out.printf(" Value in short : %d \n", s);
		System.out.printf(" Value in int : %d \n", i);

		System.out.printf(" Value in long : %d \n", l);


		System.out.printf("Value in float :\t %.1f \n", f);
		System.out.printf("Value in double :\t %,.1f \n", d);
		System.out.printf("Value in double :\t %,.1f \n", d1);

		System.out.printf("Value in String :\t %30s \n", "This is a short string.");

		System.out.print("Enter char: ");
		c = input.next().charAt(0);

		System.out.print("Enter String: ");
		String str = input.next();

		System.out.printf(" %s ", str);






	}




}