package week7;

public class Employee extends Person{
    private String ssn;
    private String jobTitle;

    public Employee(String name, int age, String ssn, String jobTitle) {
        super(name, age);// call to super construcotor
        this.ssn = ssn;
        this.jobTitle = jobTitle;
        System.out.println("parametized constructor");
    }

    public Employee() {
        this("Default name",12,"default ssn","default title"); // call to super construcotor
        System.out.println("Default constructr of employee");
    }

    public String getSsn() {
        return ssn;
    }
    public void setSsn(String ssn) {
        this.ssn = ssn;
    }
    public String getJobTitle() {
        return jobTitle;
    }
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
    public double calculateSalary(){
        return 0;
    }

    @Override
    public String toString() {
        // super
        return String.format("%s SSN:%s JobTitle:%s",super.toString(),ssn,jobTitle);
    }
}
