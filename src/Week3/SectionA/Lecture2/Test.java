public class Test{

		Test(){

		}
		Test(int a){
			this();

		}

	public static void main(String args[]){

		System.out.println("Test class");

		//this();

		Date d1 = new Date(27,2,2025);

		Date d2=new Date();

		Date d3 = new Date(20);
		Date d4 = new Date(1960,30);

		System.out.println(d1.getFormatedDate());
		System.out.println(d2.getFormatedDate());
		System.out.println(d3.getFormatedDate());
		System.out.println(d4.getFormatedDate());

		Math m1=new Math();

		m1.findMin(4,5.0);
		m1.findMin(4, m1.findMin(5,m1.findMin(6,7)));




	}
	

}