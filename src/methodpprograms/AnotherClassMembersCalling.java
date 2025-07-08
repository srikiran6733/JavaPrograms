package methodpprograms;

/**
 * This class demonstrates how to call static and non-static methods
 * from another class within the same package.
 *
 * It accesses:
 * - Static methods from StaticMethodsDemo
 * - Non-static methods from NonStaticMethodsDemo
 */
public class AnotherClassMembersCalling {

    /**
     * Main method that shows calling of static and non-static methods
     * from other classes in the same package.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // -------- Calling Static Methods from StaticMethodsDemo --------

        // Call static method with no parameters
        StaticMethodsDemo.m1();

        // Call static method that returns a value
        int v1 = StaticMethodsDemo.m2();
        System.out.println("v1 output value is :" + v1);

        // Call overloaded static method with two int parameters
        StaticMethodsDemo.m1(15, 10);

        // Call overloaded static method that returns a value
        int v2 = StaticMethodsDemo.m2(10, 9);
        System.out.println("v2 output value is :" + v2);

        System.out.println("**************************");

        // -------- Calling Non-Static Methods from NonStaticMethodsDemo --------

        // Create an object of NonStaticMethodsDemo class
        NonStaticMethodsDemo objref = new NonStaticMethodsDemo();

        // Call non-static method with no parameters
        objref.m1();

        // Call overloaded non-static method with two int parameters
        objref.m1(15, 10);

        // Call non-static method that returns a value
        int result = objref.m2();
        System.out.println("result value is :" + result);

        // Call overloaded non-static method that returns a value
        int result1 = objref.m2(15, 8);
        System.out.println("result value is :" + result1);
    }
}
