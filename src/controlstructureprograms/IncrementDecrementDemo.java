package controlstructureprograms;

public class IncrementDecrementDemo {
    public static void incrementDecrementDemo(){
        System.out.println("Started executing the incrementDecrementDemo().....");
        System.out.println("*********Pre Increment**********");
        int g=15;
        System.out.println("Before pre increment g value is :"+g);
        int s=75+(++g);
        System.out.println("After pre increment g value is :"+g);
        System.out.println("After pre increment s value is :"+s);

        System.out.println("*********Post Increment**********");
        int gs=45;
        System.out.println("Before post increment gs value is :"+gs);
        int ch=10+(gs++);
        System.out.println("After post increment gs value is :"+gs);
        System.out.println("After post increment ch value is :"+ch);

        System.out.println("*********Pre decrement**********");
        int g1=15;
        System.out.println("Before pre decrement g1 value is :"+g1);
        int s1=75+(--g);
        System.out.println("After pre decrement g1 value is :"+g1);
        System.out.println("After pre decrement s1 value is :"+s1);

        System.out.println("*********Post decrement**********");
        int gs1=45;
        System.out.println("Before post decrement gs value is :"+gs1);
        int ch1=10+(gs--);
        System.out.println("After post decrement gs value is :"+gs1);
        System.out.println("After post decrement ch value is :"+ch1);

        System.out.println("*********Charecter Pre Increment**********");

        char chctr='A';
        System.out.println("Before pre increment gs value is :"+chctr);
        char chctr1= (char) (5+(++chctr));
        System.out.println("After pre increment gs value is :"+chctr);
        System.out.println("After pre increment ch value is :"+chctr1);

        System.out.println("*********Charecter Post Increment**********");

        char postch='A';
        System.out.println("Before post increment gs value is :"+postch);
        char postch1= (char) (1+(++postch));
        System.out.println("After pre increment gs value is :"+chctr);
        System.out.println("After pre increment ch value is :"+postch1);

        System.out.println("*********Charecter Pre decrement**********");

        char prechdecrement='H';
        System.out.println("Before post decrement value is :"+prechdecrement);
        char prechdecrement1= (char) (5+(prechdecrement--));
        System.out.println("After pre increment value is :"+prechdecrement);
        System.out.println("After pre increment value is :"+prechdecrement1);

        System.out.println("*********Charecter Post decrement**********");

        char postchdecrement='K';
        System.out.println("Before post decrement value is :"+postchdecrement);
        char postchdecrement1= (char) (1+(--postchdecrement));
        System.out.println("After pre decrement value is :"+postchdecrement);
        System.out.println("After pre decrement value is :"+postchdecrement1);
    }




    public static void main(String[] args) {
        incrementDecrementDemo();

    }
}
