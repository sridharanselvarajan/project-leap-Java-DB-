// Dogclass.java (Child Class)
package Bank;
public class Dogclass extends Animalclass {
    // Private variable for breed
    private String breed;

    // Constructor for Dogclass, calling Animalclass constructor using 'super'
    public Dogclass(String name, String breed) {
        super(name);  // Calling parent class constructor
        this.breed = breed;  // 'this' refers to the current class instance
        System.out.println("Dogclass Constructor: " + breed);
    }

    // Getter method for breed (to access the private variable)
    public String getBreed() {
        return breed;
    }

    // Setter method for breed (to modify the private variable)
    public void setBreed(String breed) {
        this.breed = breed;
    }

    // Dogclass-specific method
    public void display() {
        System.out.println("Dog is a domestic animal. Breed: " + breed);
    }
}
