package controlstructureprograms;

public class ConditionalDemoPrograms {

    /**
     * Write a program to find the biggest number from the given numbers
     * @param a,b,c
     */
    public static void printBiggerValue(int a,int b,int c){
        if(a>b&&a>c){
            System.out.println("a is bigger value than b,c ");
        }else if(b>c&&b>a){
            System.out.println("b is bigger value than a,c");
        }else if(c>a&&c>b){
            System.out.println("c is bigger value than b,a");
        }
    }

    /**
     * Write a program to find BMI
     * @param weight , height
     */
    protected static void findBMI(double weight,double height){
        System.out.println("Started executing the findBMI().... for height :"+height+" weight :"+weight);

        double bodyMassIndex=weight/height*height;

        if(bodyMassIndex<18.5){
            System.out.println("Your BMI is :"+bodyMassIndex+" , you are underweight.");
        } else if (bodyMassIndex>18.5 && bodyMassIndex<25) {
            System.out.println("Your BMI is :"+bodyMassIndex+" ,  you have a normal weight.");
        } else if (bodyMassIndex>25 && bodyMassIndex<30) {
            System.out.println("Your BMI is :"+bodyMassIndex+" ,  you are obese.");
        }else if (bodyMassIndex>30 && bodyMassIndex<35) {
            System.out.println("Your BMI is :"+bodyMassIndex+" ,  you are slightly overweight.");
        }else if (bodyMassIndex>35) {
            System.out.println("Your BMI is :"+bodyMassIndex+" ,  you are clinically obese.");
        }else {
            System.out.println("provided the invalid data...");
        }
    }

    /**
     * Write a program to check given year is leap year or not
     * @param year
     */
    protected static void IsLeapYear(int year){
        System.out.println("Started executing the IsLeapYear().....");

        //if((year/4==0 && year/100!=0) || year/400==0 ){
        if(year%4==0){
            System.out.println(" Given year : "+year+" is a leap year");
        }else if(year%100!=0){
            System.out.println(" Given year : "+year+" is a not leap year");
        } else if (year%400==0) {
            System.out.println(" Given year : "+year+" is a leap year");
        }else {
            System.out.println(" Given year : "+year+" is not a valid year");
        }
    }

    
    public static void main(String[] args) {
        printBiggerValue(1256,7852,4785);
        findBMI(35.5,5.5);
        IsLeapYear(2001);
    }
}
