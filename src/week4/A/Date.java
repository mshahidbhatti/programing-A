public class Date{

	int day;
	int month;
	int year;

	//Time t;
	
	Date(int day, int month, int year){
		this.day=day;
		this.month=month;
	this.year=year;


	}
	Date(Date d){
		day=d.day;
		month=d.month;
		year=d.year;

	}

	public void display(){

		System.out.printf("%d-%d-%d\n",day,month,year);
	}

}