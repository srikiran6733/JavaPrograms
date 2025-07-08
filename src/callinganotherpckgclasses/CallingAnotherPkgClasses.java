package callinganotherpckgclasses;

import methodpprograms.NonStaticMethodsDemo;
import methodpprograms.StaticMethodsDemo;

/**
 * This class demonstrates how to call static and non-static methods
 * from another package in Java.
 *
 * It uses:
 * - Static methods from StaticMethodsDemo class
 * - Non-static methods from NonStaticMethodsDemo class
 */
public class CallingAnotherPkgClasses {

    /**
     * Main method to execute the method calls from other package classes.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Calling static methods from StaticMethodsDemo class

        // Static method without parameters
        StaticMethodsDemo.m1();

        // Static method with two int parameters
        StaticMethodsDemo.m1(10, 5);

        // Static method that returns an int value
        int r1 = StaticMethodsDemo.m2();
        System.out.println("r1 value is :" + r1);

        // Static method with parameters that returns an int
        int r2 = StaticMethodsDemo.m2(45, 5);
        System.out.println("r2 value is :" + r2);

        System.out.println("*******************************");

        // Calling non-static methods from NonStaticMethodsDemo class

        // Create an object of NonStaticMethodsDemo to call instance methods
        NonStaticMethodsDemo objref1 = new NonStaticMethodsDemo();

        // Call non-static method without parameters
        objref1.m1();

        // Call overloaded method with parameters
        objref1.m1(15, 10);

        // Call non-static method returning a result
        int result = objref1.m2();
        System.out.println("result value is :" + result);

        // Call overloaded method with parameters returning a result
        int result1 = objref1.m2(15, 8);
        System.out.println("result value is :" + result1);
    }
}
