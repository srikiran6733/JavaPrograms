package recapprograms;

import java.util.Arrays;

/**
 * This class contains multiple static utility methods to demonstrate
 * common operations on integer arrays, such as:
 * - Generating a random array
 * - Finding the largest and smallest element
 * - Printing even numbers and calculating their sum
 */
public class ArrayDemoPrograms {

    /**
     * Generates an integer array of size 5 with random numbers between 0 and 99
     * @return An array of random integers
     */
    public static int[] getRandomArray() {
        System.out.println("Started executing the getRandomArray().....");

        final int SIZE = 5;
        int[] randArr = new int[SIZE];

        // Populate the array with random integers from 0 to 99
        for (int i = 0; i < SIZE; i++) {
            randArr[i] = (int) (Math.random() * 100);
        }

        return randArr;
    }

    /**
     * Finds and returns the largest element in the given array
     * @param num the input integer array
     * @return the largest integer in the array
     */
    public static int getLargestArrayElement(int[] num) {
        System.out.println("Initial array is: " + Arrays.toString(num));

        if (num.length == 0) {
            throw new IllegalArgumentException("Invalid array input");
        }

        int max = num[0];

        // Iterate through the array to find the maximum value
        for (int i = 1; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }
        }

        return max;
    }

    /**
     * Finds and returns the smallest element in the given array
     * @param num the input integer array
     * @return the smallest integer in the array
     */
    public static int getSmallestArrayElement(int[] num) {
        System.out.println("Initial array is: " + Arrays.toString(num));

        if (num.length == 0) {
            throw new IllegalArgumentException("Invalid array input");
        }

        int min = num[0];

        // Iterate through the array to find the minimum value
        for (int i = 1; i < num.length; i++) {
            if (num[i] < min) {
                min = num[i];
            }
        }

        return min;
    }

    /**
     * Prints the even numbers from the given array and calculates their sum
     * @param num the input integer array
     * @return the sum of even numbers in the array
     */
    public static int printEvenNumbers(int[] num) {
        System.out.println("Started executing the printEvenNumbers(int[] num).....");
        int evenSum = 0;
        System.out.print("Even numbers in the array: ");
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                System.out.print(num[i] + "\t");
                evenSum += num[i];
            }
        }
        System.out.println(); // for newline
        return evenSum;
    }

    /**
     * Main method to test the array utility methods
     */
    public static void main(String[] args) {
        // Generate a random array of 5 integers
        int[] randArray = getRandomArray();
        System.out.println("Random array is: " + Arrays.toString(randArray));

        // Get the largest element in the array
        int maxEle = getLargestArrayElement(randArray);
        System.out.println("Max element is: " + maxEle);

        // Get the smallest element in the array
        int minEle = getSmallestArrayElement(randArray);
        System.out.println("Min element is: " + minEle);

        // Print even numbers and calculate their sum
        int evenSum = printEvenNumbers(randArray);
        System.out.println("Sum of even numbers is: " + evenSum);
    }
}
