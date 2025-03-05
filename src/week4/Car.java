public class Car{

	// has a relation
	// composition, aggregation, deep copy, shallow copy, copy constructor

	 Engine engine;

	 Car(Engine e){

		engine=e;
	} 

	Car(){
		engine = new Engine();
	}



	public boolean equals(Car other){
		
		return this.engine==other.engine?true:false;

	}

	public boolean equals(Object other){
		Car car1=(Car)other;

		return this.engine==car1.engine?true:false;

	}


}