public class Student{

	private String name;
	private String regNo;
	private String address;
	private double gpa;
	private String phoneNumber;
	private static int counter=1;


	public Student(String name, String address, double gpa, String phoneNumber){
		this.name=name;
		this.address=address;
		this.gpa=gpa;
		this.phoneNumber=phoneNumber;
		regNo=String.format("FA24-BCS-%03d",counter++);


	}

	public void display(){
		System.out.printf("Name : %s \n",name);
		System.out.printf("RegNo : %s \n",regNo);
		System.out.printf("Address : %s \n",address);
		System.out.printf("GPA : %f \n",gpa);
		System.out.printf("Phone Number : %s \n",phoneNumber);

	}


	public void setGPA(double gpa){
		if(gpa>0)
			this.gpa=gpa;
	}



}