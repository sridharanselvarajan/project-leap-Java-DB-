package partiallyabstraction;

//Main class to test the partially abstract class
public class partiallmain{
 public static void main(String[] args) {
     Shape circle = new Circle(5.0);  // Circle with radius 5
     circle.setColor("Red");
     System.out.println("Circle Color: " + circle.getColor());
     System.out.println("Circle Area: " + circle.calculateArea());
     System.out.println("Circle Perimeter: " + circle.calculatePerimeter());
     System.out.println();

     Shape rectangle = new Rectangle(4.0, 6.0);  // Rectangle with length 4 and width 6
     rectangle.setColor("Blue");
     System.out.println("Rectangle Color: " + rectangle.getColor());
     System.out.println("Rectangle Area: " + rectangle.calculateArea());
     System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());
 }
}
