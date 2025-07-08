package datatypeprograms;

/**
 * Demonstrates the usage of arithmetic, relational, and logical operators
 * in Java using static variables and expressions.
 */
public class OperatorsDemo {

    // Static integer variables used in operations
    public static int g = 25, s = 10;

    /**
     * Main method to run operator demonstrations.
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        // --------- Arithmetic Operators ---------

        // Addition of g and s
        int addition = g + s;
        System.out.println("g+s expression addition result value is :" + addition);

        // Subtraction of s from g
        int sub = g - s;
        System.out.println("g-s expression addition result value is :" + sub);

        // Integer division of g by s
        int div = g / s;
        System.out.println("g/s expression addition result value is :" + div);

        // Multiplication of g and s
        int multiplication = g * s;
        System.out.println("g*s expression addition result value is :" + multiplication);


        // --------- Relational (Comparison) Operators ---------

        // Greater than
        boolean g1 = g > s;
        System.out.println("g>s expression result value is :" + g1);

        // Less than
        boolean g2 = g < s;
        System.out.println("g<s expression result value is :" + g2);

        // Equal to
        boolean g3 = g == s;
        System.out.println("g==s expression result value is :" + g3);

        // Greater than or equal to
        boolean g4 = g >= s;
        System.out.println("g>=s expression result value is :" + g4);

        // Less than or equal to
        boolean g5 = g <= s;
        System.out.println("g<=s expression result value is :" + g5);


        // --------- Logical Operators ---------

        // Logical AND: true && false => false
        boolean g6 = (g > s) && (g < 18);
        System.out.println("(g>s) && (g<18) expression result value is :" + g6);

        // Logical AND: true && true => true
        boolean g7 = (g > s) && (s < 18);
        System.out.println("(g>s) && (s<18) expression result value is :" + g7);

        // Logical OR: true || false => true
        boolean g8 = (g > s) || (g < 18);
        System.out.println("(g>s) || (g<18) expression result value is :" + g8);

        // Logical NOT EQUAL: true != true => false
        boolean g9 = (g7 != g8);
        System.out.println("g7 != g8 expression result value is :" + g9);
    }
}
