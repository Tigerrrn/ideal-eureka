package lab1.lab1;

public class Triangle {
    
    private double triangleBase;
    private double triangleHeight;
    private double triangleSide;
    
    public Triangle(double triangleBase, double triangleHeight, double triangleSide) {
        this.triangleBase = triangleBase;
        this.triangleHeight = triangleHeight;
        this.triangleSide = triangleSide;
    }

    public double getTriangleBase() {
        return triangleBase;
    }

    public void setTriangleBase(double triangleBase) {
        this.triangleBase = triangleBase;
    }

    public double getTriangleHeight() {
        return triangleHeight;
    }

    public void setTriangleHeight(double triangleHeight) {
        this.triangleHeight = triangleHeight;
    }

    public double getTriangleSide() {
        return triangleSide;
    }

    public void setTriangleSide(double triangleSide) {
        this.triangleSide = triangleSide;
    }
    
    public double area() {
        return (triangleBase * triangleHeight) / 2;
    }
    
    public double perimeter() {
        return triangleBase + 2 * triangleSide;
    }
}
