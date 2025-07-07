package methodpprograms;

public class StaticMethodsDemo {

    public static void m1(){
        System.out.println("This is static method without parameters.....");
        System.out.println("static methods we can call directly in any static and non static methods");
    }

    public static void m1(int a,int b){
        System.out.println("This is static method with parameters.....");
        System.out.println("static method with parameters we can call directly in any static and non static methods, but we need to provide the values to the parameters");
    int res=a+b;
        System.out.println("res value is :"+res);
    }
    public static int m2(){
        System.out.println("This is static method without void and without parameters.....");
        System.out.println("return type static methods we can call directly in any static and non static methods");
        int a=23,b=10;
        int sub=a-b;
        System.out.println("sub value is : "+sub);
        return sub;
    }
    public static int m2(int x, int y){
        System.out.println("This is static method without void and without parameters.....");
        System.out.println("return type static methods we can call directly in any static and non static methods");

        int mul=x*y;
        System.out.println("sub value is : "+mul);
        return mul;
    }
    public static void main(String[] args) {
        m1();
        m1(100,151);
        int i=m2();
        System.out.println(" i value is :"+i);

        int i1=m2(10,5);
        System.out.println("i2 value result is :"+i1);
    }
}
