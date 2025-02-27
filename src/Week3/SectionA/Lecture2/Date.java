public class Date{

	private int day;

	private int month;
	private int year;

	public Date(int day, int month, int year){
		setDay(day);
		setMonth(month);
		setYear(year);
	}

	public Date(){
		this(1);
	}
	public Date(int year){
		this(1,1,year);
	}

	public Date(int month,int year ){
		this(1, month, year);
	}

	public int getDay(){
		return day;
	}
	public int getMonth(){
		return month;
	}

	public int getYear(){
		return year;
	}

	public void setDay(int day){
		this.day=day;
	}

	public void setMonth(int month){
		if(month>0&&month<=12)
		this.month=month;
	}
	public void setYear(int year){
		if(year>0)
		this.year=year;
	}

	public String getFormatedDate(){
		String formatedDate= String.format("%02d-%02d-%d",day,month, year);
		return formatedDate;

	}

}
