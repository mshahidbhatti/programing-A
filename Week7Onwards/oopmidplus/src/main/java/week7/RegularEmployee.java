package week7;

public class RegularEmployee extends Employee {
    private double baseSalary;
    private double houseRent;

    public RegularEmployee(String name, int age, String ssn, String jobTitle, double baseSalary, double houseRent) {
        super(name, age, ssn, jobTitle);
        this.baseSalary = baseSalary;
        this.houseRent = houseRent;
    }

    public RegularEmployee() {
    }

    @Override
    public double calculateSalary() {
        return baseSalary + houseRent;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getHouseRent() {
        return houseRent;
    }

    public void setHouseRent(double houseRent) {
        this.houseRent = houseRent;
    }
}



