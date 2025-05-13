package InheritanceTest.ShapeTest;

public class ShapeTest {
    public static void main(String[] args) {
        Shape shapes[]=new Shape[20];
        for (int i=0;i<20;i++){
            if(i<5)
                shapes[i]=new Circle();
            if (i>5&&i<10)
                shapes[i]=new Rectangle();
            if(i>10&&i<15)
                shapes[i]=new Sphere();
            if(i>15&& i< shapes.length)
                shapes[i]=new Cube();
        }


        Shape shape2=new Circle();
        Draw draw=new Circle();



        for(Shape shape:shapes)
            System.out.println("Area of Shape:"+shape.area());

        for(int i=0;i< shapes.length;i++)
            if(shapes[i] instanceof Circle)
                ((Circle) shapes[i]).setRadius(20);

    }
    public static void shapeCount(Shape[] shapes){}
}
