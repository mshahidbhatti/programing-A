package util;

public class Shape {
    private String color;

    // Constructor
    public Shape(String color) {
        this.color = color;
    }

    // Method to display shape details
    public void displayShape() {
        System.out.println("Color: " + color);
    }

    // Getters and Setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
