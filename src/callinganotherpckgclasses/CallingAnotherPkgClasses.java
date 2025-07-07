package callinganotherpckgclasses;
import methodpprograms.NonStaticMethodsDemo;
import methodpprograms.StaticMethodsDemo;
import methodpprograms.StaticMethodsDemo.*;
import methodpprograms.NonStaticMethodsDemo.*;

public class CallingAnotherPkgClasses {


    public static void main(String[] args) {
        //Calling StaticMethodsDemo class static methods from another package class
        StaticMethodsDemo.m1();
        StaticMethodsDemo.m1(10,5);

        int r1 = StaticMethodsDemo.m2();
        System.out.println("r1 value is :"+r1);

        int r2 = StaticMethodsDemo.m2(45,5);
        System.out.println("r1 value is :"+r2);

        System.out.println("*******************************");
        //Calling NonStaticMethodsDemo class non static methods from another package class
        //create an object for the parent class
        NonStaticMethodsDemo objref1 = new NonStaticMethodsDemo();

        objref1.m1();
        objref1.m1(15,10);

        int result=objref1.m2();
        System.out.println("result value is :"+result);

        int result1=objref1.m2(15,8);
        System.out.println("result value is :"+result1);
    }
}
