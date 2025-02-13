//class declaration
class Rectangle{

	//data members
	double height=1;
	double width=1;


	public double calArea(){

		return height*width;
	}

	public double calPerimeter(){
		return (height+width)*2;
	}


	public void display(){

		System.out.println("Width of Rect:"+width);
		System.out.println("Height of Rect:"+height);

	}




}

