// obj1 == obj2   
// obj1.equals(obj2)


public class CompositionTest{
	
	public static void main(String args[]){
		Engine e=new Engine();

		Car car=new Car();
		Car car2=new Car();

		if(car.equals(car2))
			System.out.println("Objects are equal");
		else
			System.out.println("Objects are not equal");

		// car.engine=e; 

		Engine e2= car.getEngine();
		//e2=null;
		car=null;
		System.out.println(e2);

		car=null;


	}

}