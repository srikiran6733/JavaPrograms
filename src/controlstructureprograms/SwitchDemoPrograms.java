package controlstructureprograms;

import java.util.Scanner;

public class SwitchDemoPrograms {

    /**
     * Checks if the given character is a vowel using switch-case.
     *
     * @param c the character to be checked
     */
    public static void givenCharIsVowel(char c) {
        // Switch statement to match vowels
        switch (c) {
            case 'a':
                System.out.println("Given character 'a' is a vowel.");
                break;
            case 'e':
                System.out.println("Given character 'e' is a vowel.");
                break;
            case 'i':
                System.out.println("Given character 'i' is a vowel.");
                break;
            case 'o':
                System.out.println("Given character 'o' is a vowel.");
                break;
            case 'u':
                System.out.println("Given character 'u' is a vowel.");
                break;
            default:
                // If not a, e, i, o, or u, then it's not a vowel
                System.out.println("Given character is not a vowel.");
        }
    }

    /**
     * Reads two numbers and an operator from user input,
     * performs the respective mathematical operation using switch-case,
     * and prints the result.
     */
    public static void calculation() {
        double n1, n2;        // Variables to hold input numbers
        char operator;        // Variable to hold arithmetic operator

        // Create a Scanner object to read input from keyboard
        Scanner sc = new Scanner(System.in);

        // Read first number
        System.out.println("Enter n1 value:");
        n1 = sc.nextDouble();

        // Read second number
        System.out.println("Enter n2 value:");
        n2 = sc.nextDouble();

        // Read the operator (expects +, -, *, or /)
        System.out.println("Enter operator (+, -, *, /):");
        operator = sc.next().charAt(0);

        double output = 0.0; // Variable to store the result

        // Switch block to handle different operations based on operator
        switch (operator) {
            case '+':
                output = n1 + n2;  // Addition
                break;
            case '-':
                output = n1 - n2;  // Subtraction
                break;
            case '*':
                output = n1 * n2;  // Multiplication
                break;
            case '/':
                output = n1 / n2;  // Division
                break;
            default:
                // If operator is not one of the above, print error
                System.out.println("Invalid operator entered.");
                return; // Exit method early if invalid
        }

        // Print the formatted output of the operation
        System.out.println(n1 + " " + operator + " " + n2 + " = " + output);
    }

    /**
     * Main method to test the above methods.
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        // Test the vowel checking logic
        givenCharIsVowel('e');

        // Run the calculator program
        calculation();
    }
}
