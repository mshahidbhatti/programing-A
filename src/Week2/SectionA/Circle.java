public class Circle {


	private double radius; // greater than 0

	public Circle(){
		radius=20;

	}

	public double getRadius(){
		return radius;
	}

	public void setRadius(double r){
		if(r>0)
			radius=r;
	}




}