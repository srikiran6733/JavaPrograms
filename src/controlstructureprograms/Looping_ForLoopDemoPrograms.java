package controlstructureprograms;

public class Looping_ForLoopDemoPrograms {

    /**
     * Prints uppercase alphabets from A to Z using for loop.
     */
    public static void printAToZAlphabets(){
        System.out.println("Started executing the printAToZAlphabets()..... ");
        for(char c='A'; c<='Z'; c++) {
            System.out.print(c + "\t");
        }
        System.out.println("\nCompleted executing the printAToZAlphabets()..... ");
    }

    /**
     * Prints uppercase alphabets from Z to A using for loop.
     */
    public static void printZToAAlphabets() {
        System.out.println("Started executing the printZToAAlphabets()..... ");
        for (char c = 'Z'; c >= 'A'; c--) {
            System.out.print(c + "\t");
        }
        System.out.println("\nCompleted executing the printZToAAlphabets()..... ");
    }

    /**
     * Prints ASCII values from A to Z.
     */
    protected static void printAToZSCIIValues(){
        System.out.println("Started executing the printAToZSCIIValues()..... ");
        for (int c = 'A'; c <= 'Z'; c++) {
            System.out.print(c + "\t");
        }
        System.out.println("\nCompleted executing the printAToZSCIIValues()..... ");
    }

    /**
     * Prints ASCII values from Z to A.
     */
    protected static void printZToASCIIValues(){
        System.out.println("Started executing the printZToASCIIValues()..... ");
        for (int c = 'Z'; c >= 'A'; c--) {
            System.out.print(c + "\t");
        }
        System.out.println("\nCompleted executing the printZToASCIIValues()..... ");
    }

    /**
     * Prints lowercase alphabets from a to z.
     */
    public static void printaTozAlphabets(){
        System.out.println("Started executing the printaTozAlphabets()..... ");
        for(char c='a'; c<='z'; c++) {
            System.out.print(c + "\t");
        }
        System.out.println("\nCompleted executing the printaTozAlphabets()..... ");
    }

    /**
     * Prints lowercase alphabets from z to a.
     */
    public static void printzToaAlphabets() {
        System.out.println("Started executing the printzToaAlphabets()..... ");
        for (char c = 'z'; c >= 'a'; c--) {
            System.out.print(c + "\t");
        }
        System.out.println("\nCompleted executing the printzToaAlphabets()..... ");
    }

    /**
     * Prints ASCII values from a to z.
     */
    protected static void printaTozSCIIValues(){
        System.out.println("Started executing the printaTozSCIIValues()..... ");
        for (int c = 'a'; c <= 'z'; c++) {
            System.out.print(c + "\t");
        }
        System.out.println("\nCompleted executing the printaTozSCIIValues()..... ");
    }

    /**
     * Prints ASCII values from z to a.
     */
    protected static void printzToaSCIIValues(){
        System.out.println("Started executing the printzToaSCIIValues()..... ");
        for (int c = 'z'; c >= 'a'; c--) {
            System.out.print(c + "\t");
        }
        System.out.println("\nCompleted executing the printzToaSCIIValues()..... ");
    }

    /**
     * Prints even numbers from 0 to n.
     */
    protected static void printEvenNumbers(int n){
        System.out.println("Started executing the even numbers....");
        for(int i = 0; i <= n; i++) {
            if(i % 2 == 0) {
                System.out.print(i + "\t");
            }
        }
        System.out.println();
    }

    /**
     * Prints odd numbers from 0 to n.
     */
    protected static void printOddNumbers(int n){
        System.out.println("Started executing the Odd numbers....");
        for(int i = 0; i <= n; i++) {
            if(i % 2 != 0) {
                System.out.print(i + "\t");
            }
        }
        System.out.println();
    }

    /**
     * Prints multiplication table for a given number up to n.
     */
    private static void printMultiplicationTable(int m, int n){
        System.out.println("Started executing the printMultiplicationTable().....");
        for(int i = 1; i <= n; i++) {
            System.out.println(m + "X" + i + "=" + (m * i));
        }
    }

    /**
     * Calculates and prints the sum of even and odd numbers up to n.
     */
    public static void sumOfEvenOddNumbers(int n){
        System.out.println("Started executing the sumOfEvenOddNumbers().....");
        int evenSum = 0, oddSum = 0;
        for(int i = 1; i <= n; i++) {
            if(i % 2 == 0) {
                evenSum += i;
            } else {
                oddSum += i;
            }
        }
        System.out.println("Even Numbers Sum is :" + evenSum);
        System.out.println("Odd Numbers Sum is :" + oddSum);
    }

    /**
     * Returns the difference between sum of even and odd numbers up to n.
     */
    private static int evenAndOddNumbersDiff(int n){
        System.out.println("Started executing the evenAndOddNumbersDiff(int n).....");
        int evenSum = 0, oddSum = 0;
        for(int i = 1; i <= n; i++) {
            if(i % 2 == 0) {
                evenSum += i;
            } else {
                oddSum += i;
            }
        }
        return evenSum - oddSum;
    }

    /**
     * Swaps two numbers using a temporary variable.
     */
    protected static void swapWithThirdVariable(){
        System.out.println("Started executing the swapWithThirdVariable()....");
        int temp = 0, n1 = 10, n2 = 15;
        System.out.println("Before swapping n1: " + n1 + ", n2: " + n2);
        temp = n1;
        n1 = n2;
        n2 = temp;
        System.out.println("After swapping n1: " + n1 + ", n2: " + n2);
    }

    /**
     * Swaps two numbers without using a temporary variable.
     */
    protected static void swapWithOutThirdVariable(){
        System.out.println("Started executing the swapWithOutThirdVariable()....");
        int n1 = 10, n2 = 150;
        System.out.println("Before swapping n1: " + n1 + ", n2: " + n2);
        n1 = n1 + n2;
        n2 = n1 - n2;
        n1 = n1 - n2;
        System.out.println("After swapping n1: " + n1 + ", n2: " + n2);
    }

    /**
     * Returns a random double value between 0.0 and 1.0.
     */
    private static double getRandomNumber(){
        return Math.random();
    }

    /**
     * Returns a random integer between 0 and 99.
     */
    private static int getRandomNum(){
        return (int)(Math.random() * 100);
    }

    /**
     * Returns a random integer between 0 and the given number.
     */
    private static int getIntRandomNum(int num){
        return (int)(Math.random() * num);
    }

    /**
     * Converts Celsius to Fahrenheit and returns the result.
     */
    protected static float convertCelciusToForehnhit(float ct){
        System.out.println("Before convert ct value is :" + ct + " to Fahrenheit");
        return (float) (ct * 1.8 + 32);
    }

    /**
     * Returns the maximum of two long values.
     */
    private static long getMaxValue(long l1, long l2){
        System.out.println("Started executing the getMaxValue(long l1,long l2) .......");
        return Math.max(l1, l2);
    }

    public static void main(String[] args) {
        swapWithThirdVariable();
        swapWithOutThirdVariable();

        double getRandVal = getRandomNumber();
        System.out.println("Random Number value is :" + getRandVal);

        int getRandValue = getRandomNum();
        System.out.println("Random Number value is :" + getRandValue);

        float forhenheit = convertCelciusToForehnhit(35.5F);
        System.out.println("Fahrenheit value is :" + forhenheit);

        int randomNumber = getIntRandomNum(3);
        System.out.println("Integer Random Number is: " + randomNumber);

        long maxValues = getMaxValue(7855419, 78954165);
        System.out.println("Max value is :" + maxValues);

        /* Uncomment below lines to test more methods
        printAToZAlphabets();
        printZToAAlphabets();
        printZToASCIIValues();
        printAToZSCIIValues();
        printaTozAlphabets();
        printzToaAlphabets();
        printzToaSCIIValues();
        printaTozSCIIValues();
        printEvenNumbers(10);
        printOddNumbers(10);
        printMultiplicationTable(2, 10);
        sumOfEvenOddNumbers(10);
        int diff = evenAndOddNumbersDiff(10);
        System.out.println("Even and Odd Numbers Sum result is :" + diff);
        */
    }
}
