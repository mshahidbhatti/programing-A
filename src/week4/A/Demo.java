public class Demo{

	public static void main(String args[]){
		Date d1=new Date(1,1,1);

		d1.display();


		Person p1=new Person("name 1",new Date(d1));
		
		p1.dob.display();

		p1.dob.year=2025;


		d1.display();

		Person p2 = new Person("name 2", new Date(1,1,1));

		//	Person(String name, Date dob, Address address){
		Person p3 = new Person("name 3", new Date(1,1,1), new Address("Pakistan"));

		Person p4=p3;

		Person p5= new Person(p3.name, p3.dob, p3.address);

		Person p6= new Person(p3.name, new Date(p3.dob.day,p3.dob.month,p3.dob.year), p3.address);

		p5.dob.month=10;

		p5.dob.display();
		p3.dob.display();
		p6.dob.display();

		Person p7=new Person(p3);





	}
}