//class declaration
public class CircleTest{


	 public static void main(String[] args){

		int a=10;

		Circle c1; // declaration of variable
		c1 = new Circle(); // call to constructor of circle, c1 is object reference

		c1.calArea(); // function call

		System.out.println("Radius of c1: "+c1.radius);
		c1.radius=-10;
		c1.calArea(); // function call
		System.out.println("Radius of c1: "+c1.radius);
		System.out.println(c1.calArea());

		Circle c2 = new Circle();
		System.out.println("Radius of c2: "+c2.radius);

		//c1=c2;

		

		double circ=c1.calCircumference();
		
		System.out.println(c1);  // by default this will print address

		//declaration of reference variable
		Rectangle r= new Rectangle();

		//r = c1; incompatible types

		double rA= r.calArea();

		System.out.println("Hello Test");

	}

}