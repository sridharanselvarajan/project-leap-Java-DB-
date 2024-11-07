package partiallyabstraction;

//Partially abstract class
abstract class Shape {
 private String color;  // Concrete variable

 // Concrete method (can be inherited as-is)
 public void setColor(String color) {
     this.color = color;
 }

 // Concrete method to get the color
 public String getColor() {
     return color;
 }

 // Abstract method (must be implemented by subclasses)
 public abstract double calculateArea();

 // Abstract method (must be implemented by subclasses)
 public abstract double calculatePerimeter();
}
