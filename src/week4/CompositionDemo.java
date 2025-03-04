public class CompositionDemo{


public static void main(String args[]){

	Date dob=new Date(1,1,1);

	Person p1 = new Person("Name 1", new Date(1,1,1));

	//p1.dob=new Date(1,1,1);

	System.out.println(p1.getDOB().year);


	Person p2 = new Person("Name 2", dob);
	//System.out.println(p2.dob);
	
	//Person p3=new Person(p1.name, new Date(p.getDOB().day,p.getDOB().month,p.getDOB().year));
	
	Person p3 =new Person(p1); //deep copy




	

}

}