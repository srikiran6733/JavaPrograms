package controlstructureprograms;

import java.util.Scanner;

public class SwitchDemoPrograms {

    public static void givenCharIsVowel(char c){

        switch (c){
            case 'a':
                System.out.println("Given charecter a is vowel :");
                break;
            case 'e':
                System.out.println("Given charecter e is vowel");
                break;
            case 'i':
                System.out.println("Given charecter i is vowel :");
                break;
            case 'o':
                System.out.println("Given charecter o is vowel :");
                break;
            case 'u':
                System.out.println("Given charecter u is vowel :");
                break;
            default:
                System.out.println("Given charecter is not a vowel :");
        }


    }

    /**
     * Write a program to read the data from keyboard & frame mathematical operations
     *
     * @param args
     */
    public static void calculation(){
        double n1,n2;
        char operator;

        //create an object for the scanner
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter n1 value :");
        n1=sc.nextDouble();

        System.out.println("Enter n2 value :");
        n2=sc.nextDouble();

        operator=sc.next().charAt(0);

        double output=0.0;
        switch (operator){
            case '+':
            output=n1+n2;
            break;
            case '-':
                output=n1-n2;
                break;
            case '*':
                output=n1*n2;
                break;
            case '/':
                output=n1/n2;
                break;
            default:
                System.out.println("Invalid data");
        }
        System.out.println(n1+" "+operator+" "+n2+" "+" = "+output);

    }
    private static void calculator(){
        //declare n1,n2,operator
        double n1,n2;
        char operator;

        //create an object for the Scanner class to give the input from the keyboard
        Scanner sc= new Scanner(System.in);

        System.out.println(" Enter n1 value :");
        n1=sc.nextDouble();

        System.out.println(" Enter n2 value :");
        n2=sc.nextDouble();

        operator=sc.next().charAt(0);

        //declare output as variable
        double output=0.0;

        switch (operator){
            case '+':
                output=n1+n2;
                break;
            case '-':
                output=n1-n2;
                break;
            case '*':
                output=n1*n2;
                break;
            case '/':
                output=n1/n2;
                break;
            default:
                System.out.println("Invalid data");
        }
        System.out.println(n1+" "+operator+" "+n2+" "+" = "+output);
    }
    



    public static void main(String[] args) {
        givenCharIsVowel('e');
        calculation();

    }
}
