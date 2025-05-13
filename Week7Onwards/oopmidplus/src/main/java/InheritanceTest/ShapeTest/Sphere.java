package InheritanceTest.ShapeTest;

public class Sphere extends Shape3D {
    private double radius;


    @Override
    public double volume() {
        return (4.0/3.0)*Math.PI*Math.pow(radius,3);
    }

    @Override
    public double area() {
        return 4*Math.PI*Math.pow(radius,2);
    }

    @Override
    public void draw() {

    }
}
