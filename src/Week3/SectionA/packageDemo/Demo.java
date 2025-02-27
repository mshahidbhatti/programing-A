public class Demo{

	public static void main(String args[]){
		Person p1=new Person();

		Person p2=new Person("p1","add","adfads");

		Person p3= new Person("p3","adfdsa");


		Person p4=new Person();
		p4.findMax(1,2);

		p4.findMax(1,p4.findMax(4,5));


	}

}