package util;
public class Temp{

	public Temp(){
	}

	public static Temp console(){
		return new Temp();
		
	}

	public class InnerClass{
		
		public void print(){
			System.out.println("Print from inner class");
		}

	}



}