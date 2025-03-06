public class Car{

	private final Engine engine;


	Car(){
		engine=new Engine();

	}

	public Engine getEngine(){

		return engine;
	}

	public boolean equals(Object o){
		return true;
	}
}