package temp.A;

public class Librarian extends Person {
    private int yearsOfService;

    public Librarian(String name, int yearsOfService) {
        super(name);
        this.yearsOfService = yearsOfService;
    }

    public String toString() {
        return super.toString() + ", Years of Service: " + yearsOfService;
    }
}
