package lab1.lab1;

public class Rectangle {
    
    private double rectBase;
    private double rectHeight;
    
    public Rectangle(double rectBase, double rectHeight) {
        this.rectBase = rectBase;
        this.rectHeight = rectHeight;
    }

    public double getRectBase() {
        return rectBase;
    }

    public void setRectBase(double rectBase) {
        this.rectBase = rectBase;
    }

    public double getRectHeight() {
        return rectHeight;
    }

    public void setRectHeight(double rectHeight) {
        this.rectHeight = rectHeight;
    }
    
    public double area() {
        return rectBase * rectHeight;
    }
    
    public double perimeter() {
        return 2 * rectBase + 2 * rectHeight;
    }
}
