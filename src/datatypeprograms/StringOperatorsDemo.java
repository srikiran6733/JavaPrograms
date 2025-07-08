package datatypeprograms;

/**
 * Demonstrates various operations using string concatenation in Java.
 * Covers the use of strings combined with integers and expressions.
 */
public class StringOperatorsDemo {

    /**
     * Main method demonstrating string concatenation behavior with literals and variables.
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        // String demo program using literals
        String s = "Java";
        String s1 = "Selenium";

        // Concatenating two strings
        String s2 = s + s1; // JavaSelenium
        System.out.println("s+s1 expression s2 result value is :" + s2);

        // Concatenating string with integer
        String s3 = s + 45; // Java45
        System.out.println("s+45 expression s3 result value is :" + s3);

        // Concatenating string with two integers sequentially
        String s4 = s + 45 + 4; // Java454
        System.out.println("s+45+4 expression s4 result value is :" + s4);

        // Integer before string changes evaluation order
        String s5 = 78 + s + 4; // 78Java4
        System.out.println("78+s+4 expression s5 result value is :" + s5);

        // Adding two integers before string concatenation
        String s6 = 4 + 14 + s2; // 18JavaSelenium
        System.out.println("4+14+s2 expression s6 result value is :" + s6);

        // Using parentheses to control evaluation order inside concatenation
        String s7 = s + (45 + 4) + 8 + s1; // Java498Selenium
        System.out.println("s+(45+4)+8+s2 expression s7 result value is :" + s7);

        // More complex concatenation combining strings, numbers, and expressions
        String s8 = s2 + (45 + 4) + s1 + s2; // JavaSelenium49SeleniumJavaSelenium
        System.out.println("s2+(45+4)+s1+s2 expression s8 result value is :" + s8);
    }
}