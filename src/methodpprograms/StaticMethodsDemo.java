package methodpprograms;

/**
 * This class demonstrates various examples of static methods in Java.
 * It includes:
 * - Static methods with and without parameters
 * - Static methods with and without return values
 * Shows how they can be called directly from other static or non-static contexts.
 */
public class StaticMethodsDemo {

    /**
     * Static method without parameters and without return type.
     * Simply prints a message to the console.
     */
    public static void m1() {
        System.out.println("This is static method without parameters.....");
        System.out.println("Static methods can be called directly in any static or non-static methods.");
    }

    /**
     * Static method with parameters and without return type.
     * Adds two integers and prints the result.
     *
     * @param a First integer value
     * @param b Second integer value
     */
    public static void m1(int a, int b) {
        System.out.println("This is static method with parameters.....");
        System.out.println("Static methods with parameters can be called directly, but we must pass values.");
        int res = a + b; // Perform addition
        System.out.println("Result value is: " + res);
    }

    /**
     * Static method without parameters but with return type.
     * Performs subtraction of two fixed integers and returns the result.
     *
     * @return Result of subtraction (a - b)
     */
    public static int m2() {
        System.out.println("This is static method with return type and no parameters.....");
        int a = 23, b = 10;
        int sub = a - b; // Perform subtraction
        System.out.println("Subtraction value is: " + sub);
        return sub;
    }

    /**
     * Static method with parameters and return type.
     * Multiplies two integers and returns the result.
     *
     * @param x First number
     * @param y Second number
     * @return Product of x and y
     */
    public static int m2(int x, int y) {
        System.out.println("This is static method with return type and parameters.....");
        int mul = x * y; // Perform multiplication
        System.out.println("Multiplication value is: " + mul);
        return mul;
    }

    /**
     * Main method to demonstrate the usage of all static methods defined in the class.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        // Calling static method without parameters
        m1();

        // Calling static method with parameters
        m1(100, 151);

        // Calling static method that returns a value (no parameters)
        int i = m2();
        System.out.println("Returned value from m2(): " + i);

        // Calling static method that returns a value (with parameters)
        int i1 = m2(10, 5);
        System.out.println("Returned value from m2(int, int): " + i1);
    }
}
