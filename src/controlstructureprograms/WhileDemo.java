package controlstructureprograms;

import java.util.Scanner;

public class WhileDemo {

    /**
     * Write a program to print 1 to 10 numbers using while loop
     * @param
     */
    public static void print1To10Numbers(){
        System.out.println("Started executing the print1To10Numbers().....");
        int i=1;
        while (i<=10){
            System.out.print(i+"\t");
            i++;
        }
        System.out.println();
        System.out.println("Completed the executing the print1To10Numbers().....");
    }
    public static void print10To1Numbers(){
        System.out.println("Started executing the print1To10Numbers().....");
        int i=10;
        while (i>=1){
            System.out.print(i+"\t");
            i--;
        }
        System.out.println();
        System.out.println("Completed the executing the print1To10Numbers().....");
    }

    /**
     * Write a program to print A To Z alphabets
     * @param
     */
    public static void printAToZAlphabets(){
        System.out.println("Started executing the printAToZAlphabets().....");
        char ch='A';
        while (ch<='Z'){
            System.out.print(ch+"\t");
            ch++;
        }
        System.out.println();
        System.out.println("Completed the executing the printAToZAlphabets().....");
    }
    /**
     * Write a program to print Z To A alphabets
     * @param
     */
    public static void printZToAAlphabets(){
        System.out.println("Started executing the printZToAAlphabets().....");
        char ch='Z';
        while (ch>='A'){
            System.out.print(ch+"\t");
            ch--;
        }
        System.out.println();
        System.out.println("Completed the executing the printAToZAlphabets().....");
    }
    /**
     * Write a program to print A To Z alphabets
     * @param
     */
    public static void printAToZAsciiCodes(){
        System.out.println("Started executing the printAToZAsciiCodes().....");
        int a='A';
        while (a<='Z'){
            System.out.print(a+"\t");
            a++;
        }
        System.out.println();
        System.out.println("Completed the executing the printAToZAsciiCodes().....");
    }
    /**
     * Write a program to print Z To A alphabets
     * @param
     */
    public static void printZToAAsciiCodes(){
        System.out.println("Started executing the printZToAAsciiCodes().....");
        int ch='Z';
        while (ch>='A'){
            System.out.print(ch+"\t");
            ch--;
        }
        System.out.println();
        System.out.println("Completed the executing the printZToAAsciiCodes().....");
    }
    private static void infiniteLoop(){
        while (true){
            System.out.println("condition is true...");
        }

    }
    private static void infiniteLoop1(){
        int i=1;
        while (i>=0){
            System.out.print(i+"\t");
            i++;
        }
        System.out.println();
    }
    /**
     * Write a program to print 5 divisibles
     * @param
     */
    private static void print5Divisibles(int n){
        System.out.println("Started executing the print5Divisibles().....");
        int i=5;
        while (i<=n){
            if(i%5==0){
                System.out.print(i+"\t");
            }
            i++;
        }
        System.out.println();
    }
    /**
     * Write a program to print even numbers from 1 to 100
     * @param
     */
    public static void print1To100EvenNumbers(){
    System.out.println("STarted executing the print1To100EvenNumbers().....");
    int i=1;
    while (i<=100){
        if(i%2==0){
            System.out.print(i+"\t");
        }
        i++;
    }
        System.out.println();
}
    /**
     * Check given number is an even number or not
     * @param
     */
    public static void checkEvenNumber(){
    System.out.println("Started ececuting the checkEvenNumber()....");
    //Create an onject for scanner class
    Scanner sc= new Scanner(System.in);
    char choice='y';
    while (choice=='y'||choice=='Y'){
        System.out.println("Enter number :");
        int num=sc.nextInt();

        if(num%2==0){
            System.out.println("Given number is an even number.....");
        }else {
            System.out.println("Given number is not an even number.....");
        }
        System.out.println("Do you want to enter another choice ?(y/n) :");
        choice=sc.next().charAt(0);
    }

    sc.close();
}
    public static void print50To1OddNumbers(){
        System.out.println("Started executing the print50To1OddNumbers().....");
        int i=50;
        while(i>=1){
           if(i%2!=0){
               System.out.print(i+"\t");
           }
           i--;
        }
        System.out.println();
    }

    /**
     * Write a program to print A to Z alphabets
     * @param
     */
    private static void printAToZAlphabetsUsingWhileLoop(){
        System.out.println("Started executing the printAToZAlphabetsUsingWhileLoop().....");
        char ch='A';
        while(ch<='Z'){
            System.out.print(ch+"\t");
            ch++;
        }
        System.out.println();
    }
    /**
     * Write a program to print A to Z alphabets ascii values
     * @param
     */
    private static void printAToZAsciiCodesUsingWhileLoop(){
        System.out.println("Started executing the printAToZAsciiCodesUsingWhileLoop().....");
        int ch='A';
        while(ch<='Z'){
            System.out.print(ch+"\t");
            ch++;
        }

    }
    /**
     * Write a program to print z to a alphabets
     * @param
     */
    private static void printaTozAlphabetsUsingWhileLoop(){
        System.out.println("Started executing the printaTozAlphabetsUsingWhileLoop().....");
        char ch='a';
        while(ch<='z'){
            System.out.print(ch+"\t");
            ch++;
        }
        System.out.println();
    }
    private static void printaTozAsciiValuesUsingWhileLoop(){
        System.out.println("Started executing the printaTozAsciiValuesUsingWhileLoop().....");
        int ch='a';
        while(ch<='z'){
            System.out.print(ch+"\t");
            ch++;
        }
        System.out.println();
    }
    private static void printzToaAsciiValuesUsingWhileLoop(){
        System.out.println("Started executing the printzToaAsciiValuesUsingWhileLoop().....");
        int ch='z';
        while(ch>='a'){
            System.out.print(ch+"\t");
            ch--;
        }
        System.out.println();
    }
    private static void printzToaAlphabetsUsingWhileLoop(){
        System.out.println("Started executing the printzToaAlphabetsUsingWhileLoop().....");
        char ch='z';
        while(ch>='a'){
            System.out.print(ch+"\t");
            ch--;
        }
        System.out.println();
    }

    /**
     * Write a program to print multiplication
     * @param m
     */
    public static void multiplication(int m){
        System.out.println("Started executing the multiplication() .....");
        int i=1;
        while(i<=10){
            System.out.println(m+" * "+i+" = "+(m*i));
            i++;
        }
    }

    /**
     * write a program to find the even & odd numbers sum
     * @param n
     */
    public static int evenAndOddNumbersSumDiff(int n){
        System.out.println("Started executing the evenAndOddNumbersSumDiff() .....");
        int evenSum=0,oddSum=0;
        int i=1;
        while(i<=n){
            if(i%2==0){
                evenSum+=i;
            }else {
                oddSum+=i;
            }
            i++;
        }

        System.out.println("Even Numbers sum is :"+evenSum);
        System.out.println("Odd Numbers sum is :"+oddSum);
        return (evenSum-oddSum);
    }

    /**
     * write a program to print sum of n numbers
     * @param n
     */
    public static void printSumOfnNumbers(int n){
        System.out.println("Stated executing the printSumOfnNumbers() .....");
        int sum=0;
        int i=1;
        while(i<=n){
                sum+=i;
            i++;

        }

    }

    /**
     * write a program to get the factorial value
     * @param n
     */

    public static void getFactorial(int n){
        System.out.println("Started executing the getFactorial() .....");
        int i=1,fact=1;
        while (i<=n){
            fact=fact*i;
            i++;
        }
        System.out.println("Factorial value is :"+fact);
    }

    /**
     * write a program to get factorial value using recursive
     * @param n
     */
protected static int getFactorialValue(int n){
    if(n==0)
        return 1;
    return n*getFactorialValue(n-1);

}
    public static void main(String[] args) {

        print1To10Numbers();
        print10To1Numbers();
        printAToZAlphabets();
        printZToAAlphabets();
        printAToZAsciiCodes();
        printZToAAsciiCodes();
       // infiniteLoop();
       // infiniteLoop1();
        print5Divisibles(100);
        print1To100EvenNumbers();
        //checkEvenNumber();
        print50To1OddNumbers();
        printAToZAlphabetsUsingWhileLoop();
        printAToZAsciiCodesUsingWhileLoop();
        printaTozAlphabetsUsingWhileLoop();
        printaTozAsciiValuesUsingWhileLoop();
        printzToaAsciiValuesUsingWhileLoop();
        printzToaAlphabetsUsingWhileLoop();
        multiplication(5);
        int evenOddNumbersDiff = evenAndOddNumbersSumDiff(100);
        System.out.println("Even Numbers and Odd Number sum diff is :"+evenOddNumbersDiff);
        printSumOfnNumbers(5);
        getFactorial(5);
        int recursive = getFactorialValue(6);
        System.out.println("Get factorial value using recursive is :"+recursive);
    }

}
