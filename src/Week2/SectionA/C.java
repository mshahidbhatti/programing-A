public class C{

	static int x=33;





	{
	System.out.println(x++);
	System.out.println("This is code from code block 2 "+Math.PI);
	}

	static {

	System.out.println("This is code from static code block 1 :"+Math.pow(2,2));
	}



	C(){
		System.out.println("This is constructor call");
	}



	void C(){
		System.out.println("THis is method call");
	}




}