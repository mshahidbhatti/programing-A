package InheritanceTest.ShapeTest;

public class InterfaceTest {
    public static void main(String[] args) {
        Printable printable=new Printable() {
            @Override
            public void print() {
                System.out.println("this is print method");
            }

            @Override
            public void printIt() {
                System.out.println("This is printit method");
            }
        };

        Drawable drawable=new Drawable() {
            @Override
            public void draw() {
                System.out.println("Drawble is called");
            }
        };

        drawable.draw();

        Drawable drawable1=new Drawit();
        drawable1.draw();

        Drawable drawable2= () -> System.out.println("hello ");

        drawable2.draw();



        Sum sum = (e,a) -> System.out.println(e+a);

       sum(sum);

    }

    public static void sum(Sum s){

    }
}
