//class declaration
public class CircleTest{


	 public static void main(String[] args){

		int a=10;

		Circle c1; // declaration of variable
		c1 = new Circle(); // call to constructor of circle, c1 is object reference

		c1.calArea(); // function call

		double circ=c1.calCircumference();
		
		System.out.println(c1);  // by default this will print address

		//declaration of reference variable
		Rectangle r= new Rectangle();

		double rA= r.calArea();

		System.out.println("Hello Test");

	}

}