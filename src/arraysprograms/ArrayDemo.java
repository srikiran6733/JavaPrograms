package arraysprograms;

import java.util.Arrays;

public class ArrayDemo {

    public static void printVowels(){
        System.out.println("Started executing the printVowels()......");
        //Initialize the array
        char[] vowels=new char[5];

        //Inserting the values to array

        //1st element
        vowels[0]='a';

        //2nd element
        vowels[1]='e';

        //3rd element
        vowels[2]='i';

        //4th element
        vowels[3]='o';

        //5th element
        vowels[4]='u';

        //6th element
        //vowels[5]='k';

        //find the length of the array is
        System.out.println("Vowels lenght is :"+vowels.length);

        //iterate the array using for each loop
        for(char c:vowels){
            System.out.print(c+" ");
        }
        System.out.println();
        //iterate the array using for loop
        for(char c=0;c<vowels.length;c++){
            System.out.print(vowels[c]+" ");
        }
        System.out.println();
    }

    /**
     * Write a program to get the random array
     *
     */
    protected static int[] getRandomArray(){
        System.out.println("Started executing the getRandomArray().....");
        final int SIZE=5;
        int[] randArr=new int[SIZE];

        for(int i=0;i<SIZE;i++){
            randArr[i]= (int) (Math.random()*100);
        }
        return randArr;
    }

    /**
     * Write a program to find the max element from the given array
     *
     */

    public static int getMaxElement(int[] num){
        System.out.println("The initial array element is :"+Arrays.toString(num));

        if(num.length==0){
            throw new IllegalArgumentException("Invalid array input");
        }
        int max= num[0];
        for(int i=0;i< num.length;i++){
            if(num[i]>max){
                max=num[i];
            }
        }
        return max;
    }
    /**
     * Write a program to find the max element from the given array
     *
     */

    public static int getMinElement(int[] num){
        System.out.println("The initial array element is :"+Arrays.toString(num));

        if(num.length==0){
            throw new IllegalArgumentException("Invalid array input");
        }
        int min= num[0];
        for(int i=0;i< num.length;i++){
            if(num[i]<min){
                min=num[i];
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

    public static void main(String[] args) {
        printVowels();
       int[] randomArr= getRandomArray();
        System.out.println("Random array is :"+Arrays.toString(randomArr));

        int maxEle= getMaxElement(randomArr);
        System.out.println("Max element from the random array is :"+maxEle);

        int minEle= getMinElement(randomArr);
        System.out.println("Min element from the random array is :"+minEle);
    }
}
