public class B{

	int a;

	static int c=500;

	static{
		static{
		System.out.println("unnamed block");
		}
	}

	{
	System.out.println("non unnamed block");
	}
	B(int i){

		System.out.println("constructor is called");

		a=20;
	}


	static int findMax(int a, int b){
		return a>b?a:b;

	}








}