package InheritanceTest.ShapeTest.functionalInterfaces;

import java.io.Serial;
import java.io.Serializable;

public class Test implements Serializable {
    public static void main(String[] args) {
        Printable printable= e -> System.out.println(e);

      //  printable.PrintThings("Print it");
        displayPrintThings(printable);

        Sumable sumable=(a,b)-> {return a+b;};
    }
    public static void displayPrintThings(Printable p){
        p.PrintThings("adfdsaf ");
    }

    public static void sum01(Sumable s){
        s.sum(1,2);
    }
}
