package InheritanceTest.ShapeTest;

public class Cube extends Shape3D{
    private double side;

    @Override
    public double volume() {
        return Math.pow(side,3);
    }

    @Override
    public double area() {
        return 6*Math.pow(side,2);
    }

    @Override
    public void draw() {

    }
}
