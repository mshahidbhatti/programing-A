package InheritanceTest.ShapeTest;

import InheritanceTest.ShapeTest.functionalInterfaces.Point;

public class Rectangle extends Shape2D{
    private double length;
    private double width;
    private Point lefTopCorner;

    @Override
    public double area() {
        return length*width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public void draw() {

    }

    public Point getLefTopCorner() {
        return lefTopCorner;
    }

    public void setLefTopCorner(Point lefTopCorner) {
        this.lefTopCorner = lefTopCorner;
    }
}
