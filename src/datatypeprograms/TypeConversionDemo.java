package datatypeprograms;

/**
 * Demonstrates type conversion (casting) between various primitive data types in Java.
 * Shows both implicit (widening) and explicit (narrowing) conversions.
 */
public class TypeConversionDemo {

    /**
     * Main method where conversions are performed and printed.
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        // Explicit conversion (narrowing) from int to byte
        int i = 15;
        byte b = (byte) i;
        System.out.println("Byte b value is :" + b);

        // Implicit conversion (widening) from byte to int
        byte b1 = 10;
        int i1 = b1;
        System.out.println("i1 value is :" + i1);

        // Explicit conversion (narrowing) from double to long
        double d = 10.56;
        long l = (long) d;
        System.out.println("long l value is :" + l);

        // Implicit conversion (widening) from long to double
        long l1 = 15;
        double d1 = l1;
        System.out.println("double d1 value is :" + d1);

        // Implicit conversion from short to float
        short sh = 15;
        float f = sh;
        System.out.println("float f value is :" + f);

        // Implicit conversion from float to double
        float f1 = 65.8F;
        double d2 = f1;
        System.out.println("double d2 value is :" + d2);
    }
}