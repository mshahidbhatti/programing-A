public class Person{

	String name;
	Date dob;
	Address address;

	Person(String name, Date dob){
		this.name=name;
		this.dob=dob;

	}
	Person(String name, Date dob, Address address){
		this.name=name;
		this.dob=dob;
		this.address=address;

	}
	Person(Person p){
		this.name=p.name;
		this.dob=new Date(p.dob);
		this.address=new Address(p.address);

	}


	public Address getAddress(){

		return address;
	}



}