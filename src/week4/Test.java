public class Test{

public static void main(String args[]){

	Engine e=new Engine();
	Car car=new Car(e);

	//car=null;
		Car car1=new Car(e);

		if(car.equals(car1))
			System.out.println("Objects are equal");
	}

}