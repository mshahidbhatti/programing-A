public class Demo{



	public static void main(String args[]){
	//Student(String name, String address, double gpa, String phoneNumber){
		Student std1=new Student("Ahmad","Lahore",3.0,"111111");

		Student std2=new Student("Ahmad Ali","Lahore",3.0,"2222");

		std1.display();
		std2.display();
		std2.setGPA(3.9);

	
	}

}