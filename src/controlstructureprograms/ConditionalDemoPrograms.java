package controlstructureprograms;

public class ConditionalDemoPrograms {

    /**
     * Finds and prints the biggest number among three integers.
     *
     * @param a first integer
     * @param b second integer
     * @param c third integer
     */
    public static void printBiggerValue(int a, int b, int c) {
        // Check if a is greater than both b and c
        if (a > b && a > c) {
            System.out.println("a is bigger value than b,c ");
        }
        // Check if b is greater than both a and c
        else if (b > c && b > a) {
            System.out.println("b is bigger value than a,c");
        }
        // Check if c is greater than both a and b
        else if (c > a && c > b) {
            System.out.println("c is bigger value than b,a");
        }
    }

    /**
     * Calculates and prints the Body Mass Index (BMI) based on weight and height.
     *
     * @param weight weight in kilograms
     * @param height height in meters
     */
    protected static void findBMI(double weight, double height) {
        System.out.println("Started executing the findBMI().... for height :" + height + " weight :" + weight);

        // Calculate BMI using the correct formula: weight / (height * height)
        double bodyMassIndex = weight / (height * height);

        // Print BMI category based on the calculated value
        if (bodyMassIndex < 18.5) {
            System.out.println("Your BMI is :" + bodyMassIndex + " , you are underweight.");
        } else if (bodyMassIndex >= 18.5 && bodyMassIndex < 25) {
            System.out.println("Your BMI is :" + bodyMassIndex + " ,  you have a normal weight.");
        } else if (bodyMassIndex >= 25 && bodyMassIndex < 30) {
            System.out.println("Your BMI is :" + bodyMassIndex + " ,  you are slightly overweight.");
        } else if (bodyMassIndex >= 30 && bodyMassIndex < 35) {
            System.out.println("Your BMI is :" + bodyMassIndex + " ,  you are obese.");
        } else if (bodyMassIndex >= 35) {
            System.out.println("Your BMI is :" + bodyMassIndex + " ,  you are clinically obese.");
        } else {
            System.out.println("Provided invalid data...");
        }
    }

    /**
     * Determines whether the given year is a leap year.
     *
     * @param year the year to check
     */
    protected static void IsLeapYear(int year) {
        System.out.println("Started executing the IsLeapYear().....");

        // Leap year logic: divisible by 4 and not by 100 unless divisible by 400
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Given year : " + year + " is a leap year");
        } else {
            System.out.println("Given year : " + year + " is not a leap year");
        }
    }

    /**
     * Main method to execute conditional logic programs.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        printBiggerValue(1256, 7852, 4785); // Finds and prints the biggest value
        findBMI(35.5, 5.5);                // Calculates and prints the BMI
        IsLeapYear(2001);                 // Checks if a year is a leap year
    }
}
