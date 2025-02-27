public class OuterClass{

	int abc;

	


	class InnerClass{
		public void printIt(){
			System.out.println("Print from inner class");

		}

	}

	static class InnerClassStatic{
		public void printIt(){
			System.out.println("print it from static");
		}
		

	}


}