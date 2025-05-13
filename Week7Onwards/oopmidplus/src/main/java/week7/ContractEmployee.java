package week7;

public class ContractEmployee extends Employee{
    private double fixedSalary;
    private int contractDuration;
    public ContractEmployee(String name, int age, String ssn, String jobTitle, double fixedSalary, int contractDuration) {
        super(name, age, ssn, jobTitle);
        this.fixedSalary = fixedSalary;
        this.contractDuration = contractDuration;
    }
    public double getFixedSalary() {
        return fixedSalary;
    }

    public void setFixedSalary(double fixedSalary) {
        this.fixedSalary = fixedSalary;
    }

    public int getContractDuration() {
        return contractDuration;
    }

    public void setContractDuration(int contractDuration) {
        this.contractDuration = contractDuration;
    }

    @Override
    public double calculateSalary() {
        return fixedSalary + (fixedSalary * 0.1 * contractDuration);
    }


    @Override
    public String toString() {
        return String.format("%s",super.toString() + ", Fixed Salary=" + fixedSalary + ", Contract Duration=" + contractDuration);
    }

}
