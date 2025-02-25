public class Driver{

	static int var=100;
		public static void main(String args[]){



		new C();
		//c1.C();


		System.out.println(A1.findMax(1,2));

		System.out.println("This is test message");

		System.out.println(Driver.var);

		A1 obj = new A1();
		System.out.println(obj.a);

		System.out.println("Sum of two numbers");
		System.out.println(Driver.sum(1,2));
		Driver d=new Driver();
		d.divide(1,2);

		

	}


	public static int sum(int a, int b){
		return a+b;

	}
	public double divide(int a, int b){
		return a/b;

	}

}