package controlstructureprograms;

import java.util.Scanner;

public class WhileDemo {

    /**
     * Print numbers from 1 to 10 using while loop.
     */
    public static void print1To10Numbers() {
        System.out.println("Started executing the print1To10Numbers().....");
        int i = 1; // Initialize counter to 1
        while (i <= 10) { // Loop until i reaches 10
            System.out.print(i + "\t"); // Print current value of i
            i++; // Increment i by 1
        }
        System.out.println();
        System.out.println("Completed the executing the print1To10Numbers().....");
    }

    /**
     * Print numbers from 10 to 1 using while loop.
     */
    public static void print10To1Numbers() {
        System.out.println("Started executing the print10To1Numbers().....");
        int i = 10; // Start from 10
        while (i >= 1) { // Loop until i is greater than or equal to 1
            System.out.print(i + "\t"); // Print current value of i
            i--; // Decrement i by 1
        }
        System.out.println();
        System.out.println("Completed the executing the print10To1Numbers().....");
    }

    /**
     * Print uppercase alphabets A to Z.
     */
    public static void printAToZAlphabets() {
        System.out.println("Started executing the printAToZAlphabets().....");
        char ch = 'A'; // Initialize character to 'A'
        while (ch <= 'Z') { // Loop until character reaches 'Z'
            System.out.print(ch + "\t"); // Print character
            ch++; // Move to next character
        }
        System.out.println();
        System.out.println("Completed the executing the printAToZAlphabets().....");
    }

    /**
     * Print uppercase alphabets Z to A.
     */
    public static void printZToAAlphabets() {
        System.out.println("Started executing the printZToAAlphabets().....");
        char ch = 'Z'; // Start from 'Z'
        while (ch >= 'A') { // Loop until 'A'
            System.out.print(ch + "\t"); // Print current character
            ch--; // Move to previous character
        }
        System.out.println();
        System.out.println("Completed the executing the printZToAAlphabets().....");
    }

    /**
     * Print ASCII values of A to Z.
     */
    public static void printAToZAsciiCodes() {
        System.out.println("Started executing the printAToZAsciiCodes().....");
        int a = 'A'; // ASCII value of A
        while (a <= 'Z') { // Loop until ASCII value of Z
            System.out.print(a + "\t"); // Print current ASCII value
            a++; // Move to next value
        }
        System.out.println();
        System.out.println("Completed the executing the printAToZAsciiCodes().....");
    }

    /**
     * Print ASCII values from Z to A.
     */
    public static void printZToAAsciiCodes() {
        System.out.println("Started executing the printZToAAsciiCodes().....");
        int ch = 'Z'; // ASCII of Z
        while (ch >= 'A') {
            System.out.print(ch + "\t");
            ch--; // Decrement ASCII value
        }
        System.out.println();
        System.out.println("Completed the executing the printZToAAsciiCodes().....");
    }

    /**
     * Print numbers divisible by 5 from 5 to n.
     * @param n upper limit
     */
    private static void print5Divisibles(int n) {
        System.out.println("Started executing the print5Divisibles().....");
        int i = 5; // Start from 5
        while (i <= n) {
            if (i % 5 == 0) { // Check if divisible by 5
                System.out.print(i + "\t");
            }
            i++; // Increment i
        }
        System.out.println();
    }

    /**
     * Print all even numbers from 1 to 100.
     */
    public static void print1To100EvenNumbers() {
        System.out.println("Started executing the print1To100EvenNumbers().....");
        int i = 1;
        while (i <= 100) {
            if (i % 2 == 0) { // Check if even
                System.out.print(i + "\t");
            }
            i++; // Increment
        }
        System.out.println();
    }

    /**
     * Check if a number is even. Loop continues until user exits.
     */
    public static void checkEvenNumber() {
        System.out.println("Started executing the checkEvenNumber()....");
        Scanner sc = new Scanner(System.in);
        char choice = 'y';

        while (choice == 'y' || choice == 'Y') {
            System.out.println("Enter number:");
            int num = sc.nextInt(); // Read number

            if (num % 2 == 0) {
                System.out.println("Given number is an even number.....");
            } else {
                System.out.println("Given number is not an even number.....");
            }

            System.out.println("Do you want to enter another choice ?(y/n):");
            choice = sc.next().charAt(0); // Read user's choice
        }

        sc.close(); // Close scanner
    }

    /**
     * Print odd numbers from 50 to 1.
     */
    public static void print50To1OddNumbers() {
        System.out.println("Started executing the print50To1OddNumbers().....");
        int i = 50;
        while (i >= 1) {
            if (i % 2 != 0) { // Check if odd
                System.out.print(i + "\t");
            }
            i--;
        }
        System.out.println();
    }

    /**
     * Print multiplication table for given number.
     * @param m multiplication table number
     */
    public static void multiplication(int m) {
        System.out.println("Started executing the multiplication() .....");
        int i = 1;
        while (i <= 10) {
            System.out.println(m + " * " + i + " = " + (m * i)); // Print multiplication result
            i++;
        }
    }

    /**
     * Return difference between even and odd numbers sum from 1 to n.
     * @param n upper limit
     * @return difference (evenSum - oddSum)
     */
    public static int evenAndOddNumbersSumDiff(int n) {
        System.out.println("Started executing the evenAndOddNumbersSumDiff() .....");
        int evenSum = 0, oddSum = 0;
        int i = 1;
        while (i <= n) {
            if (i % 2 == 0) {
                evenSum += i; // Add to even sum
            } else {
                oddSum += i; // Add to odd sum
            }
            i++;
        }

        System.out.println("Even Numbers sum is :" + evenSum);
        System.out.println("Odd Numbers sum is :" + oddSum);
        return (evenSum - oddSum); // Return the difference
    }

    /**
     * Print the sum of n natural numbers.
     * @param n number up to which sum is calculated
     */
    public static void printSumOfnNumbers(int n) {
        System.out.println("Stated executing the printSumOfnNumbers() .....");
        int sum = 0;
        int i = 1;
        while (i <= n) {
            sum += i; // Add current value to sum
            i++;
        }
        System.out.println("Sum of " + n + " numbers is: " + sum);
    }

    /**
     * Calculate and print factorial using while loop.
     * @param n input number
     */
    public static void getFactorial(int n) {
        System.out.println("Started executing the getFactorial() .....");
        int i = 1, fact = 1;
        while (i <= n) {
            fact = fact * i; // Multiply to accumulate factorial
            i++;
        }
        System.out.println("Factorial value is :" + fact);
    }

    /**
     * Calculate factorial using recursion.
     * @param n input number
     * @return factorial result
     */
    protected static int getFactorialValue(int n) {
        if (n == 0)
            return 1; // Base case
        return n * getFactorialValue(n - 1); // Recursive call
    }

    /**
     * Write a program to sum all the entered numbers
     *
     */

    public static void addNumbers() {
        System.out.println("Started executing the addNumbers().....");

        int number, sum = 0;
        char choice;

        //create an object for the Scanner class
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Please enter a number that you want to add :");
            number = scanner.nextInt();

            sum = sum + number;

            System.out.println("Do you want to add another number(Yes/No) ?:");
            choice = scanner.next().charAt(0);
        }while (choice=='Y'||choice=='y');
        System.out.println("Sum of all numbers is :"+sum);
    }


    public static void main(String[] args) {
        print1To10Numbers();
        print10To1Numbers();
        printAToZAlphabets();
        printZToAAlphabets();
        printAToZAsciiCodes();
        printZToAAsciiCodes();
        print5Divisibles(100);
        print1To100EvenNumbers();
        print50To1OddNumbers();
        multiplication(5);
        int evenOddNumbersDiff = evenAndOddNumbersSumDiff(100);
        System.out.println("Even Numbers and Odd Number sum diff is :" + evenOddNumbersDiff);
        printSumOfnNumbers(5);
        getFactorial(5);
        int recursive = getFactorialValue(6);
        System.out.println("Get factorial value using recursive is :" + recursive);
        addNumbers();
    }
}
