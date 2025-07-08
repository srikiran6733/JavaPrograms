package controlstructureprograms;

public class IncrementDecrementDemo {

    /**
     * Demonstrates the usage of pre-increment, post-increment,
     * pre-decrement, and post-decrement operators on integers and characters.
     */
    public static void incrementDecrementDemo() {
        System.out.println("Started executing the incrementDecrementDemo().....");

        // Pre-Increment Example
        System.out.println("*********Pre Increment**********");
        int g = 15;
        System.out.println("Before pre increment, g = " + g);
        int s = 75 + (++g); // g is incremented first, then added
        System.out.println("After pre increment, g = " + g);
        System.out.println("Result of 75 + (++g), s = " + s);

        // Post-Increment Example
        System.out.println("*********Post Increment**********");
        int gs = 45;
        System.out.println("Before post increment, gs = " + gs);
        int ch = 10 + (gs++); // gs is added first, then incremented
        System.out.println("After post increment, gs = " + gs);
        System.out.println("Result of 10 + (gs++), ch = " + ch);

        // Pre-Decrement Example
        System.out.println("*********Pre decrement**********");
        int g1 = 15;
        System.out.println("Before pre decrement, g1 = " + g1);
        int s1 = 75 + (--g); // g is decremented first, then added
        System.out.println("After pre decrement, g1 = " + g1);
        System.out.println("Result of 75 + (--g), s1 = " + s1);

        // Post-Decrement Example
        System.out.println("*********Post decrement**********");
        int gs1 = 45;
        System.out.println("Before post decrement, gs1 = " + gs1);
        int ch1 = 10 + (gs--); // gs is added first, then decremented
        System.out.println("After post decrement, gs = " + gs1);
        System.out.println("Result of 10 + (gs--), ch1 = " + ch1);

        // Character Pre-Increment
        System.out.println("*********Character Pre Increment**********");
        char chctr = 'A';
        System.out.println("Before pre increment, chctr = " + chctr);
        char chctr1 = (char) (5 + (++chctr)); // chctr incremented, then 5 added
        System.out.println("After pre increment, chctr = " + chctr);
        System.out.println("Result of 5 + (++chctr), chctr1 = " + chctr1);

        // Character Post-Increment
        System.out.println("*********Character Post Increment**********");
        char postch = 'A';
        System.out.println("Before post increment, postch = " + postch);
        char postch1 = (char) (1 + (++postch)); // pre-increment actually
        System.out.println("After pre increment, postch = " + postch);
        System.out.println("Result of 1 + (++postch), postch1 = " + postch1);

        // Character Post-Decrement
        System.out.println("*********Character Pre decrement**********");
        char prechdecrement = 'H';
        System.out.println("Before post decrement, prechdecrement = " + prechdecrement);
        char prechdecrement1 = (char) (5 + (prechdecrement--)); // value used first, then decremented
        System.out.println("After post decrement, prechdecrement = " + prechdecrement);
        System.out.println("Result of 5 + (prechdecrement--), prechdecrement1 = " + prechdecrement1);

        // Character Pre-Decrement
        System.out.println("*********Character Post decrement**********");
        char postchdecrement = 'K';
        System.out.println("Before pre decrement, postchdecrement = " + postchdecrement);
        char postchdecrement1 = (char) (1 + (--postchdecrement)); // pre-decrement then add
        System.out.println("After pre decrement, postchdecrement = " + postchdecrement);
        System.out.println("Result of 1 + (--postchdecrement), postchdecrement1 = " + postchdecrement1);
    }

    /**
     * Main method to run the increment and decrement demo.
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        incrementDecrementDemo();
    }
}
