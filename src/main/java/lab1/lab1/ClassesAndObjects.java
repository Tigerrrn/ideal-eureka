package lab1.lab1;

import java.util.Scanner;

public class ClassesAndObjects {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Circle myCircle;
        
        Rectangle myRectangle;
        
        Triangle myTriangle;
        
        String answer;
        do {
            System.out.println("Hello, please choose which type of figure you would like to experiment with: ");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Triangle");
            
            switch (sc.nextInt()) {
                case 1:
                    System.out.println("=========================");
                    System.out.println("You have chosen circle");
                    System.out.println("Provide the radius of the circle: ");
                    myCircle = new Circle(sc.nextDouble());
                    
                    System.out.println("Would you like to calculate the area, circumference or both?");
                    System.out.println("4. Area");
                    System.out.println("5. Circumference");
                    System.out.println("6. Both");
                    
                    switch (sc.nextInt()) {
                        case 4:
                            System.out.println("Circle with radius " + myCircle.getRadius() + " has the area " + myCircle.area());
                            break;
                        case 5:
                            System.out.println("Circle with radius " + myCircle.getRadius() + " has the circumference " + myCircle.circumference());
                            break;
                        case 6:
                            System.out.println("Circle with radius " + myCircle.getRadius() + " has the area " + myCircle.area() +
                            "\nand the circumference " + myCircle.circumference());
                            break;
                    }
                    break;
                case 2:
                    System.out.println("=========================");
                    System.out.println("You have chosen rectangle");
                    System.out.println("Provide the base and the height of the rectangle: ");
                    myRectangle = new Rectangle(sc.nextDouble(), sc.nextDouble());
                    
                    System.out.println("Would you like to calculate the area, perimeter or both?");
                    System.out.println("4. Area");
                    System.out.println("5. Perimeter");
                    System.out.println("6. Both");
                    
                    switch (sc.nextInt()) {
                        case 4:
                            System.out.println("Rectangle with the base " + myRectangle.getRectBase() + " and the height " + myRectangle.getRectHeight() +
                            "\nhas the area " + myRectangle.area());
                            break;
                        case 5:
                            System.out.println("Rectangle with the base " + myRectangle.getRectBase() + " and the height " + myRectangle.getRectHeight() +
                            "\nhas the perimeter " + myRectangle.perimeter());
                            break;
                        case 6:
                            System.out.println("Rectangle with the base " + myRectangle.getRectBase() + " and the height " + myRectangle.getRectHeight() +
                            "\nhas the area " + myRectangle.area() + " and the perimeter " + myRectangle.perimeter());
                            break;
                    }
                    break;
                case 3:
                    System.out.println("=========================");
                    System.out.println("You have chosen triangle");
                    System.out.println("Provide the base, the height and length of the sides of the triangle: ");
                    myTriangle = new Triangle(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
                    
                    System.out.println("Would you like to calculate the area, perimeter or both?");
                    System.out.println("4. Area");
                    System.out.println("5. Perimeter");
                    System.out.println("6. Both");
                    switch (sc.nextInt()) {
                        case 4:
                            System.out.println("Triangle with the base " + myTriangle.getTriangleBase() + " and the height " + myTriangle.getTriangleHeight() +
                            "\nand the sides " + myTriangle.getTriangleSide() + " has the area " + myTriangle.area());
                            break;
                        case 5:
                            System.out.println("Triangle with the base " + myTriangle.getTriangleBase() + " and the height " + myTriangle.getTriangleHeight() +
                            "\nand the sides " + myTriangle.getTriangleSide() + " has the perimeter " + myTriangle.perimeter());
                            break;
                        case 6:
                            System.out.println("Triangle with the base " + myTriangle.getTriangleBase() + " and the height " + myTriangle.getTriangleHeight() +
                            "\nand the sides " + myTriangle.getTriangleSide() + " has the area " + myTriangle.area() + " and the perimeter " + myTriangle.perimeter());
                            break;
                    }
                    break;
                default:
                    System.out.println("Incorrect entry");
                    break;
            }
            System.out.println("Type Go to continue experimenting");
            answer = sc.next();
        } while (answer.equals("Go"));
    }
}
