//class declaration, Title case 
class Circle{

	//data , properties, attributes 
	// all primitive types are by default inti. by 0, or 0.0 and false in case of boolean
	double radius;


	//method, function, public is an access modifier 
	public double calArea(){
		//System.out.print(3.14*radius*radius);
		return 3.14*radius*radius;

	}// end of method

	public double calCircumference(){
		double result=radius*2*3.14;
		return result;
	}


	




}// end of class