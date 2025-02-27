public class Person{

	String name;
	String email;
	String address;
	Person(String name, String email, String address){
		

	}

	Person(){
		name="Default name";
		email="default emai";
		address="Default address";
	}

	Person(String name, String email){
		this.name=name;
		this.email="default emai";
		this.address=address;

	}



	public int findMax(int a, int b){
		return a>b?a:b;

	}
	public double findMax(int a, int b){
		return a>b?a:b;

	}

	public double findMax(double a, double b){
		return a>b?a:b;

	}



}
	