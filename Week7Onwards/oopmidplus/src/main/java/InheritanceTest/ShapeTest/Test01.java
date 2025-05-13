package InheritanceTest.ShapeTest;

public class Test01 {
    public static void main(String[] args) {

        Interface1 interface1 = new ClassA();
        interface1.method1();
        interface1.method2();

        Interface1 interface2=new Interface1() {
            @Override
            public void method1() {

            }

            @Override
            public void method2() {

            }
        };


        Interface2 interface21=new Interface2() {
            @Override
            public void method1() {

            }
        };
        interface21.method1();
        Interface2 interface22=() -> System.out.println("Hello this is functional interface");

        interface22.method1();

        Comparable<String> abc= (s) -> 0;


    }
}
