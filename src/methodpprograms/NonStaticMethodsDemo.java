package methodpprograms;

/**
 * This class demonstrates various examples of non-static methods in Java.
 * Includes:
 * - Methods with and without parameters
 * - Methods with and without return types
 * Shows how to use them by creating an object of the class.
 */
public class NonStaticMethodsDemo {

    /**
     * Non-static method without parameters and without return type.
     * Demonstrates a simple print operation.
     */
    public void m1() {
        System.out.println("This is non-static method without parameters.....");
        System.out.println("Non-static methods need to be called using an object.");
    }

    /**
     * Non-static method with parameters and without return type.
     * Performs addition of two integers and prints the result.
     *
     * @param a First number
     * @param b Second number
     */
    public void m1(int a, int b) {
        System.out.println("This is non-static method with parameters.....");
        System.out.println("This method accepts two values and performs addition.");
        int res = a + b;
        System.out.println("Result value is: " + res);
    }

    /**
     * Non-static method without parameters and with return type.
     * Performs subtraction and returns the result.
     *
     * @return the result of subtracting b from a
     */
    public int m2() {
        System.out.println("This is non-static method with return type and without parameters.....");
        int a = 23, b = 10;
        int sub = a - b;
        System.out.println("Subtraction value is: " + sub);
        return sub;
    }

    /**
     * Non-static method with parameters and with return type.
     * Performs multiplication of two integers.
     *
     * @param x First number
     * @param y Second number
     * @return the product of x and y
     */
    public int m2(int x, int y) {
        System.out.println("This is non-static method with return type and parameters.....");
        int mul = x * y;
        System.out.println("Multiplication value is: " + mul);
        return mul;
    }

    /**
     * Main method to test the non-static methods.
     * Demonstrates object creation and method calls.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        // Create an object to call non-static methods
        NonStaticMethodsDemo ns = new NonStaticMethodsDemo();

        // Calling methods with and without parameters
        ns.m1();
        ns.m1(100, 151);

        // Calling methods with return values and printing the results
        int i = ns.m2();
        System.out.println("i value is: " + i);

        int i1 = ns.m2(10, 5);
        System.out.println("i1 value result is: " + i1);
    }
}
