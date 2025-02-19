public class Square{
	private int x;

	private final int id;

	private	double side;

	private String color;


	Square(){

		id=1;
		side=1;
		color="Black";

	}


	public void setSide(double s){
		if(s>=0)
			side=s;
	}

	public double getSide(){

		return side;
	}
	
	public void setColor(String c){
		color=c;
	}

	public String getColor(){
		return color;

	}

	public void setX(int x1){
		if(x1>0 && x1<=800)
			x=x1;

	}
	public int getX(){
		return x;
	}
	
	


}