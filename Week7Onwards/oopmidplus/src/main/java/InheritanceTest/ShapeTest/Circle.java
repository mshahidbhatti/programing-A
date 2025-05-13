package InheritanceTest.ShapeTest;

import java.io.Serializable;

public class Circle extends Shape2D {
    private double radius;

    @Override
    public double area() {
        return Math.PI*Math.pow(radius,2);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {

    }
}
