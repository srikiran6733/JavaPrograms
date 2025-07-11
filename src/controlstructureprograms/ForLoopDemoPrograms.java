package controlstructureprograms;

/**
 * This class contains various demo programs using for-loops in Java.
 * Programs include number printing, ASCII codes, multiplication tables,
 * even/odd logic, sum calculation, and factorial computation.
 */
public class ForLoopDemoPrograms {

    /**
     * Prints numbers from 1 to 10 using a for loop.
     */
    protected static void print1To10NumbersUsingForLoop() {
        System.out.println("Started executing the print1To10NumbersUsingForLoop().....");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + "\t");  // Print numbers with tab space
        }
        System.out.println();
    }

    /**
     * Prints numbers from 10 to 1 using a for loop.
     */
    protected static void print10To1NumbersUsingForLoop() {
        System.out.println("Started executing the print10To1NumbersUsingForLoop().....");
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + "\t");
        }
        System.out.println();
    }

    /**
     * Prints uppercase alphabets A to Z using a for loop.
     */
    protected static void printAToZAlphabetsUsingForLoop() {
        System.out.println("Started executing the printAToZAlphabetsUsingForLoop().....");
        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.print(i + "\t");
        }
        System.out.println();
    }

    /**
     * Prints uppercase alphabets from Z to A using a for loop.
     */
    protected static void printZToAAlphabetsUsingForLoop() {
        System.out.println("Started executing the printZToAAlphabetsUsingForLoop().....");
        for (char i = 'Z'; i >= 'A'; i--) {
            System.out.print(i + "\t");
        }
        System.out.println();
    }

    /**
     * Prints ASCII codes of A to Z characters using a for loop.
     */
    protected static void printAToZAsciiCodeUsingForLoop() {
        System.out.println("Started executing the printAToZAsciiCodeUsingForLoop().....");
        for (int i = 'A'; i <= 'Z'; i++) {
            System.out.print(i + "\t");  // Print ASCII value of characters
        }
        System.out.println();
    }

    /**
     * Prints ASCII codes of characters from Z to A using a for loop.
     */
    protected static void printZToAAsciiCodesUsingForLoop() {
        System.out.println("Started executing the printZToAAsciiCodesUsingForLoop().....");
        for (int i = 'Z'; i >= 'A'; i--) {
            System.out.print(i + "\t");
        }
        System.out.println();
    }

    /**
     * Prints numbers divisible by 5 from 1 to n.
     *
     * @param n the upper limit
     */
    protected static void print5Divisibles(int n) {
        System.out.println("Started executing the 5 divisibles......");
        for (int i = 1; i <= n; i++) {
            if (i % 5 == 0) {
                System.out.print(i + "\t");
            }
        }
        System.out.println();
    }

    /**
     * Prints even numbers from 1 to n using a for loop.
     *
     * @param n the upper limit
     */
    private static void print1To100EvenNumbers(int n) {
        System.out.println("Started executing the print1To100EvenNumbers(int n) .......");
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + "\t");
            }
        }
        System.out.println();
    }

    /**
     * Prints odd numbers from 50 to 1 using a for loop.
     */
    private static void print50To1OddNumbers() {
        System.out.println("Started executing the print50To1OddNumbers(int n) .......");
        for (int i = 50; i >= 1; i--) {
            if (i % 2 != 0) {
                System.out.print(i + "\t");
            }
        }
        System.out.println();
    }

    /**
     * Prints the multiplication table for the given number.
     *
     * @param m the number to generate multiplication table for
     */
    protected static void multiplication(int m) {
        System.out.println("Started executing the multiplication(int m)......");
        for (int i = 1; i <= 10; i++) {
            System.out.println(m + " * " + i + " = " + (m * i));
        }
        System.out.println();
    }

    /**
     * Calculates and prints the sum of even and odd numbers up to n,
     * and returns the difference between them.
     *
     * @param n the upper limit
     * @return difference between even and odd sums
     */
    protected static int printEvenOddSumDiff(int n) {
        System.out.println("Started executing the printEvenOddSumDiff(int n) .....");
        int evenSum = 0, oddSum = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                evenSum += i;
            } else {
                oddSum += i;
            }
        }
        System.out.println("Even Numbers sum is :" + evenSum);
        System.out.println("Odd Numbers sum is :" + oddSum);

        return (evenSum - oddSum);
    }

    /**
     * Calculates and prints the sum of numbers from 1 to n.
     *
     * @param n the upper limit
     */
    protected static void printSumOfNNumbers(int n) {
        System.out.println("Started executing the printSumOfNNumbers(int n) ......");
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        System.out.println("Sum of all the numbers is :" + sum);
    }

    /**
     * Calculates factorial of a number using a loop.
     *
     * @param n the input number
     * @return factorial value
     */
    public static int getFactorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    /**
     * Calculates factorial of a number using recursion.
     *
     * @param n the input number
     * @return factorial value
     */
    public static int getFact(int n) {
        if (n == 0)
            return 1;
        return n * getFact(n - 1);
    }
    /**
     * Write a program to print 1 to 100 without using any numbers
     */
protected static void print1To100Numbers(){
    System.out.println("Started executing the print1To100Numbers() .....");
    for(int i=1;i<='d';i++){
        System.out.print(i+"\t");
    }
    System.out.println();
}

    /**
     * Main method to execute all demo programs.
     */
    public static void main(String[] args) {
        print1To10NumbersUsingForLoop();
        print10To1NumbersUsingForLoop();
        printAToZAlphabetsUsingForLoop();
        printZToAAlphabetsUsingForLoop();
        printAToZAsciiCodeUsingForLoop();
        printZToAAsciiCodesUsingForLoop();
        print5Divisibles(100);
        print1To100EvenNumbers(100);
        print50To1OddNumbers();
        multiplication(5);

        int sumDiff = printEvenOddSumDiff(100);
        System.out.println("Even & Odd Numbers sum difference is :" + sumDiff);

        printSumOfNNumbers(100);

        int factVal = getFactorial(5);
        System.out.println("Factorial value is :" + factVal);

        int val = getFact(5);
        System.out.println("Get the factorial value is :" + val);

        print1To100Numbers();

    }
}
