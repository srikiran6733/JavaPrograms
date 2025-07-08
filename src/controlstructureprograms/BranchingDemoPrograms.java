package controlstructureprograms;

/**
 * This class demonstrates branching statements in Java using
 * simple if, if-else, and if-else-if conditions.
 */
public class BranchingDemoPrograms {

    // Static class variables
    public static int a = 12, b = 25;

    /**
     * Demonstrates a simple if-else branching.
     * Compares static integers 'a' and 'b' to determine the smaller.
     */
    public static void ifDemo() {
        if (a <= b) {
            System.out.println("a is smaller than b");
        } else {
            System.out.println("a is not smaller than b");
        }
    }

    /**
     * Demonstrates if-else condition to determine the larger of two long values.
     * @param l first long number
     * @param k second long number
     */
    private void ifElseDemo(long l, long k) {
        if (l > k) {
            System.out.println("l is bigger value");
        } else {
            System.out.println("k is bigger value");
        }
    }

    /**
     * Demonstrates if-else-if condition to find the largest of three integers.
     */
    void ifElseIfDemo() {
        int a = 123, b = 234, c = 432;

        // Check if 'a' is smaller than 'b' and 'b' is greater than or equal to 'c'
        if (a < b && b >= c) {
            System.out.println("a is bigger value than b");
        }
        // Check if 'a' is smaller than 'b' and 'b' is smaller than or equal to 'c'
        else if (a < b && b <= c) {
            System.out.println("c is bigger value than a,b");
        }
        // If neither above, then 'b' is considered bigger
        else {
            System.out.println("b is bigger value than a,b");
        }
    }

    /**
     * Main method to execute all the demo branching programs.
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        // Call static method
        ifDemo();

        // Create an object for the class to call non-static methods
        BranchingDemoPrograms sid = new BranchingDemoPrograms();
        sid.ifElseDemo(105, 178);
        sid.ifElseIfDemo();
    }
}