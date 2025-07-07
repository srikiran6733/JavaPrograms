package controlstructureprograms;

public class Looping_ForLoopDemoPrograms {


    public static void printAToZAlphabets(){
        System.out.println("Started executing the printAToZAlphabets()..... ");
        for(char c='A';c<='Z';c++){
            System.out.print(c+"\t");
        }
        System.out.println("Completed executing the printAToZAlphabets()..... ");
    }
    public static void printZToAAlphabets() {
        System.out.println("Started executing the printAToZAlphabets()..... ");
        for (char c = 'Z'; c >= 'A'; c--) {
            System.out.print(c + "\t");
        }
        System.out.println("Completed executing the printZToAAlphabets()..... ");
    }
    protected static void printAToZSCIIValues(){
        System.out.println("Started executing the printAToZSCIIValues()..... ");
        for (int c = 'A'; c <= 'Z'; c++) {
            System.out.print(c + "\t");
        }
        System.out.println("Completed executing the printAToZSCIIValues()..... ");
    }
    protected static void printZToASCIIValues(){
        System.out.println("Started executing the printZToASCIIValues()..... ");
        for (int c = 'Z'; c >= 'A'; c--) {
            System.out.print(c + "\t");
        }
        System.out.println("Completed executing the printZToASCIIValues()..... ");
    }
    public static void printaTozAlphabets(){
        System.out.println("Started executing the printaTozAlphabets()..... ");
        for(char c='a';c<='z';c++){
            System.out.print(c+"\t");
        }
        System.out.println("Completed executing the printaTozAlphabets()..... ");
    }
    public static void printzToaAlphabets() {
        System.out.println("Started executing the printzToaAlphabets()..... ");
        for (char c = 'z'; c >= 'a'; c--) {
            System.out.print(c + "\t");
        }
        System.out.println("Completed executing the printzToaAlphabets()..... ");
    }
    protected static void printaTozSCIIValues(){
        System.out.println("Started executing the printaTozSCIIValues()..... ");
        for (int c = 'a'; c <= 'z'; c++) {
            System.out.print(c + "\t");
        }
        System.out.println("Completed executing the printaTozSCIIValues()..... ");
    }
    protected static void printzToaSCIIValues(){
        System.out.println("Started executing the printzToaSCIIValues()..... ");
        for (int c = 'z'; c >= 'a'; c--) {
            System.out.print(c + "\t");
        }
        System.out.println("Completed executing the printzToaSCIIValues()..... ");
    }
    protected static void printEvenNumbers(int n){
    System.out.println("Started executing the even numbers....");

        for(int i=0;i<=n;i++){
            if(i%2==0){
                System.out.print(i+"\t");
            }
        }
    System.out.println();
}
    protected static void printOddNumbers(int n){
        System.out.println("Started executing the Odd numbers....");
        for(int i=0;i<=n;i++){
            if(i%2!=0){
                System.out.print(i+"\t");
            }
        }
        System.out.println();
    }
    private static void printMultiplicationTable(int m, int n){
        System.out.println("Started executing the printMultiplicationTable().....");
        for(int i=1;i<=n;i++){
            System.out.println(m+"X"+i+"="+(m*i));
        }
    }
    public static void sumOfEvenOddNumbers(int n){
        System.out.println("Started executing the sumOfEvenOddNumbers().....");
        int evenSum=0,oddSum=0;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                evenSum+=i;
            }else{
                oddSum+=i;
            }
        }
        System.out.println("Even Numbers Sum is :"+evenSum);
        System.out.println("Even Numbers Sum is :"+oddSum);
    }
    private static int evenAndOddNumbersDiff(int n){
        System.out.println("Started executing the evenAndOddNumbersDiff(int n).....");
        int evenSum=0,oddSum=0;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                evenSum+=i;
            }else{
                oddSum+=i;
            }
        }
        return evenSum-oddSum;

    }
    protected static void swapWithThirdVariable(){
        System.out.println("Started executing the swapWithThirdVariable()....");
        int temp=0,n1=10,n2=15;
        System.out.println("Before swapping n1 value is:"+n1+" and n2 value is :"+n2);
        temp=n1;
        n1=n2;
        n2=temp;
        System.out.println("After swapping n1 value is:"+n1+" and n2 value is :"+n2);
    }
    protected static void swapWithOutThirdVariable(){
        System.out.println("Started executing the swapWithThirdVariable()....");
        int n1=10,n2=150;
        System.out.println("Before swapping n1 value is:"+n1+" and n2 value is :"+n2);
        n1=n1+n2;
        n2=n1-n2;
        n1=n1-n2;
        System.out.println("After swapping n1 value is:"+n1+" and n2 value is :"+n2);
    }
    private static double getRandomNumber(){
            double randNum=Math.random();
            return randNum;
    }
    private static int getRandomNum(){
        int randNum=(int)(Math.random()*100);
        return randNum;
    }
    private static int getIntRandomNum(int num){
        int randNum=(int)(Math.random()*num);
        return randNum;
    }
    protected static float convertCelciusToForehnhit(float ct){
        System.out.println("Before convert ct value is :"+ct+" to farenheit temp");
        float ft= (float) (ct*1.8+32);
        return ft;
    }
    private static long getMaxValue(long l1,long l2){
        System.out.println("Started executing the getMaxValue(long l1,long l2) .......");
        long maxVal=Math.max(l1,l2);
        return maxVal;
    }
    

            public static void main(String[] args) {

                swapWithThirdVariable();
                swapWithOutThirdVariable();
                double getRandVal = getRandomNumber();
                System.out.println("Random Number value is :"+getRandVal);
                int getRandValue = getRandomNum();
                System.out.println("Random Number value is :"+getRandValue);
                float forhenheit=convertCelciusToForehnhit(35.5F);
                System.out.println("Forenheit value is :"+forhenheit);
                int randomNumber=getIntRandomNum(3);
                System.out.println("Integer Random Number is: "+randomNumber);

                long maxValues=getMaxValue(7855419,78954165);
                System.out.println("Max value is :"+maxValues);
        /*
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
                printMultiplicationTable(2,10);
                sumOfEvenOddNumbers(10);
                int diff=evenAndOddNumbersDiff(10);
                System.out.println("Even and Odd Numbers Sum result is :"+diff);
               */

    }

}

