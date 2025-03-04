public class Person{

	String name;

	private Date dob;
	
	Person(String name, Date dob){
		this.name=name;
		this.dob=dob;

	}
	Person(){

	}

	public void setDOB(Date dob){
		this.dob=dob;

	}
	public Date getDOB(){
		return dob;
	}








}