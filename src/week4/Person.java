public class Person{

	String name;

	private Date dob;
	
	Person(String name, Date dob){
		this.name=name;
		this.dob=dob;

	}
	Person(Person person){
		this.name=person.name;

		dob=new Date(person.getDOB().day,person.getDOB().month,person.getDOB().year);

	}

	public void setDOB(Date dob){
		this.dob=dob;

	}
	public Date getDOB(){
		return dob;
	}








}