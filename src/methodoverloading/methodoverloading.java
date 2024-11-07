package methodoverloading;

public class methodoverloading {

	
	public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }

    // Overloaded method to add an integer and a double
    public double add(int a, double b) {
        return a + b;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 methodoverloading calc = new methodoverloading();

	        // Calling the overloaded methods
	        System.out.println("Sum of two integers: " + calc.add(10, 20));          // Calls the first method
	        System.out.println("Sum of three integers: " + calc.add(10, 20, 30));    // Calls the second method
	        System.out.println("Sum of two doubles: " + calc.add(10.5, 20.5));      // Calls the third method
	        System.out.println("Sum of an integer and a double: " + calc.add(10, 20.5));  // Calls the fourth method
	}

}
