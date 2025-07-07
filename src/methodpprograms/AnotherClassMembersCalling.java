package methodpprograms;

public class AnotherClassMembersCalling {

    public static void main(String[] args) {
        //Calling static methods from StaticMethodsDemo class

        StaticMethodsDemo.m1();
        int v1= StaticMethodsDemo.m2();
        System.out.println("v1 output value is :"+v1);
        StaticMethodsDemo.m1(15,10);
        int v2= StaticMethodsDemo.m2(10,9);
        System.out.println("v1 output value is :"+v2);

        //Calling non-static methods from StaticMethodsDemo class
        System.out.println("**************************");
        //Create an object for the StaticMethodsDemo class
        NonStaticMethodsDemo objref = new NonStaticMethodsDemo();

        objref.m1();
        objref.m1(15,10);

        int result=objref.m2();
        System.out.println("result value is :"+result);

        int result1=objref.m2(15,8);
        System.out.println("result value is :"+result1);

    }
}
