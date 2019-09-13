package lab1.lab1;

public class Circle {
    
    private final double PI = 3.14;
    private double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double area() {
        return radius * radius * PI;
    }
    
    public double circumference() {
        return PI * 2 * radius;
    }
    
}
