public class Test{

	public static void main(String args[]){

		A obj=A.console();

		OuterClass oc=new OuterClass();
		
		OuterClass.InnerClass ic=oc.new InnerClass();
		ic.printIt();

//OuterClass.InnerClassStatic sc = oc.new InnerClassStatic();

		//oc.InnerClassStatic.printIt();

		//InnerClassStatic	abc=new InnerClassStatic();

//OuterClass.InnerClassStatic innerObject = new OuterClass.InnerClassStatic();



	}

}