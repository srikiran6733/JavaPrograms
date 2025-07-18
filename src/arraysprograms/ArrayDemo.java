package arraysprograms;

import java.util.Arrays;

/**
 * This class demonstrates various array operations in Java, such as:
 * - Printing vowels
 * - Generating random arrays
 * - Finding min and max values
 * - Searching, sorting, rotating arrays
 * - Printing duplicates and even numbers
 */
public class ArrayDemo {

    /**
     * Prints vowels using two different looping styles: for-each and for loop
     */
    public static void printVowels(){
        System.out.println("Started executing the printVowels()......");

        // Initialize the array with a size of 5
        char[] vowels = new char[5];

        // Inserting the vowel values into array
        vowels[0] = 'a';
        vowels[1] = 'e';
        vowels[2] = 'i';
        vowels[3] = 'o';
        vowels[4] = 'u';

        // Print the length of the array
        System.out.println("Vowels length is :" + vowels.length);

        // Iterate using for-each loop
        for(char c : vowels){
            System.out.print(c + " ");
        }
        System.out.println();

        // Iterate using for loop with index
        for(int i = 0; i < vowels.length; i++){
            System.out.print(vowels[i] + " ");
        }
        System.out.println();
    }

    /**
     * Generates and returns a random integer array of size 5
     */
    protected static int[] getRandomArray(){
        System.out.println("Started executing the getRandomArray().....");

        final int SIZE = 5;
        int[] randArr = new int[SIZE];

        // Populate array with random values
        for(int i = 0; i < SIZE; i++){
            randArr[i] = (int) (Math.random() * 100);
        }
        return randArr;
    }

    /**
     * Finds and returns the maximum element in an integer array
     */
    public static int getMaxElement(int[] num){
        System.out.println("The initial array element is :" + Arrays.toString(num));

        if(num.length == 0){
            throw new IllegalArgumentException("Invalid array input");
        }

        int max = num[0];
        for(int i = 0; i < num.length; i++){
            if(num[i] > max){
                max = num[i];
            }
        }
        return max;
    }

    /**
     * Finds and returns the minimum element in an integer array
     */
    public static int getMinElement(int[] num){
        System.out.println("The initial array element is :" + Arrays.toString(num));

        if(num.length == 0){
            throw new IllegalArgumentException("Invalid array input");
        }

        int min = num[0];
        for(int i = 0; i < num.length; i++){
            if(num[i] < min){
                min = num[i];
            }
        }
        return min;
    }

    /**
     * Prints even numbers from an array and calculates their sum
     */
    public static void printEvenNumbers(int[] num) {
        System.out.println("Started executing the printEvenNumbers(int[] num).....");
        int evenSum = 0;
        System.out.print("Even numbers in the array: ");

        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                System.out.print(num[i] + "\t");
            }
        }
        System.out.println();
    }

    /**
     * Copies contents of one array into another
     */
    public static void arrayCopy(int[] num){
        System.out.println("Array 1 elements are :" + Arrays.toString(num));

        int[] num2 = new int[num.length];

        for(int i = 0; i < num.length; i++){
            num2[i] = num[i];
        }

        System.out.println("Array2 -- num2 elements are .....");
        System.out.println("num2 elements are :" + Arrays.toString(num2));
    }

    /**
     * Reverses the elements of an array in-place
     */
    public static void reverseINPlace(int[] num){
        System.out.println("Before reverse the array is :" + Arrays.toString(num));

        for(int i = 0; i < num.length / 2; i++){
            int temp = num[i];
            num[i] = num[num.length - 1 - i];
            num[num.length - 1 - i] = temp;
        }

        System.out.println("After reverse the array is :" + Arrays.toString(num));
    }

    /**
     * Searches for a given element in the array
     */
    protected static boolean searchArray(int[] num, int data){
        boolean isAvailable = false;
        for(int i = 0; i < num.length; i++){
            if(num[i] == data){
                isAvailable = true;
            }
        }
        return isAvailable;
    }

    /**
     * Prints duplicate strings from a string array
     */
    public static void printDuplicates(){
        String[] str = {"Geetha", "Nakshu", "Milky", "Shiva", "GeethaSree", "Shiva", "Nakshu"};

        for(int i = 0; i < str.length; i++){
            for(int j = i + 1; j < str.length; j++){
                if(str[i].equals(str[j])){
                    System.out.print(str[j] + "\t");
                }
            }
        }
        System.out.println();
    }

    /**
     * Sorts an array using bubble sort algorithm
     */
    public static void bubbleSort(int[] num){
        System.out.println("Before sorting array is :" + Arrays.toString(num));

        for(int i = 0; i < num.length - 1; i++){
            for(int j = 0; j < num.length - 1 - i; j++){
                if(num[j] > num[j + 1]){
                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }
        }

        System.out.println("After bubble sort array is :" + Arrays.toString(num));
    }

    /**
     * Sorts an array in ascending order
     */
    public static void sortArrayInAscendingOrder(int[] num){
        System.out.println("Before sorting array is :" + Arrays.toString(num));

        for(int i = 0; i < num.length; i++){
            for (int j = i + 1; j < num.length; j++){
                if(num[i] > num[j]) {
                    int temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        System.out.println("After sorting array is :" + Arrays.toString(num));
    }

    /**
     * Sorts an array in descending order
     */
    public static void sortArrayInDescendingOrder(int[] num){
        System.out.println("Before sorting array is :" + Arrays.toString(num));

        for(int i = 0; i < num.length; i++){
            for (int j = i + 1; j < num.length; j++){
                if(num[i] < num[j]) {
                    int temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        System.out.println("After sorting array is :" + Arrays.toString(num));
    }

    /**
     * Rotates an array to the left by 3 positions
     */
    public static void leftRotate(int[] num){
        int n = 3; // Number of rotations
        int first;

        for(int i = 0; i < n; i++){
            first = num[0];
            for(int j = 0; j < num.length - 1; j++){
                num[j] = num[j + 1];
            }
            num[num.length - 1] = first;
        }

        System.out.println("Input array after left rotate by " + n + " positions :");
        System.out.println(Arrays.toString(num));
    }

    /**
     * Rotates an array to the right by 3 positions
     */
    public static void rightRotate(int[] num){
        int n = 3; // Number of rotations
        int last;

        for(int i = 1; i <= n; i++){
            last = num[num.length - 1];
            for(int j = num.length - 1; j > 0; j--){
                num[j] = num[j - 1];
            }
            num[0] = last;
        }

        System.out.println("Input array after right rotate by " + n + " positions :");
        System.out.println(Arrays.toString(num));
    }

    /**
     * Main method to test all functions
     */
    public static void main(String[] args) {
        printVowels();

        int[] randomArr = getRandomArray();
        System.out.println("Random array is :" + Arrays.toString(randomArr));

        int maxEle = getMaxElement(randomArr);
        System.out.println("Max element from the random array is :" + maxEle);

        int minEle = getMinElement(randomArr);
        System.out.println("Min element from the random array is :" + minEle);

        arrayCopy(randomArr);
        reverseINPlace(randomArr);

        boolean result = searchArray(randomArr, 78);
        System.out.println("Result array is :" + result);

        printDuplicates();
        printEvenNumbers(randomArr);
        bubbleSort(randomArr);

        int[] num1 = {10, 5, 86, 41, 13};
        sortArrayInAscendingOrder(num1);
        sortArrayInDescendingOrder(num1);
        leftRotate(num1);
        rightRotate(num1);
    }
}
