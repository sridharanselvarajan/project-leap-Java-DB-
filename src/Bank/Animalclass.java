// Animalclass.java (Parent Class)
package Bank;
public class Animalclass {
    // Private variable
    private String name;

    // Constructor for Animalclass
    public Animalclass(String name) {
        this.name = name; // 'this' refers to the current object
        System.out.println("Animalclass Constructor: " + name);
    }

    // Getter method for name (to access the private variable)
    public String getName() {
        return name;
    }

    // Setter method for name (to modify the private variable)
    public void setName(String name) {
        this.name = name;
    }

    // Method to make sound
    public void makeSound() {
        System.out.println(name + " makes a sound");
    }
}
