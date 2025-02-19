public class Test{


	public static void main (String args[]){

		System.out.println("Test clas ");

		int i=0;

		Circle c1=null; // declaration of variable
		c1 = new Circle();  // instance creation/object

		c1.calArea();  // method call
		c1.calCircum();

		c1.radius = 20;
		Circle c2= new Circle();

		System.out.println(c1);
		System.out.println(c2);

		c2=c1;

		System.out.println(c1);
		System.out.println(c2);



		//System.out.println(c1);

		Rectangle r1 = new Rectangle();
		r1.height=-20;
		






		
	}


}