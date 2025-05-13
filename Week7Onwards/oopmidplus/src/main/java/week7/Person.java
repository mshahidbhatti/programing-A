package week7;

public class Person extends Object{

    private String name;
    private int age;

    public Person(String name, int age) {
        this();

        this.name = name;
        this.age = age;
    }

    public Person() {
        this.name = "default name";
        this.age = 10;
        System.out.println("default constructor of person");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {this.age = age;}

    @Override
    public String toString() {
        return String.format("Name:%s Age: %d",name,age);
    }
}
