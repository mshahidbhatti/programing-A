package InheritanceTest.ShapeTest;

public class Test {
    public static void main(String[] args) {

        PrintThings printThings = s-> System.out.println(s);


        printThings.printIt("Print this string");

        GetMinimum getMinimum = (a,b) -> {return a;};


    }
}
