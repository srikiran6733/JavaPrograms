package methodpprograms;

public class NonStaticMethodsDemo {

    public void m1(){
        System.out.println("This is static method without parameters.....");
        System.out.println("static methods we can call directly in any static and non static methods");
    }

    public void m1(int a,int b){
        System.out.println("This is static method with parameters.....");
        System.out.println("static method with parameters we can call directly in any static and non static methods, but we need to provide the values to the parameters");
    int res=a+b;
        System.out.println("res value is :"+res);
    }
    public int m2(){
        System.out.println("This is static method without void and without parameters.....");
        System.out.println("return type static methods we can call directly in any static and non static methods");
        int a=23,b=10;
        int sub=a-b;
        System.out.println("sub value is : "+sub);
        return sub;
    }
    public int m2(int x, int y){
        System.out.println("This is static method without void and without parameters.....");
        System.out.println("return type static methods we can call directly in any static and non static methods");

        int mul=x*y;
        System.out.println("sub value is : "+mul);
        return mul;
    }
    public static void main(String[] args) {
        NonStaticMethodsDemo ns= new NonStaticMethodsDemo();

        ns.m1();
        ns.m1(100,151);
        int i=ns.m2();
        System.out.println(" i value is :"+i);

        int i1=ns.m2(10,5);
        System.out.println("i2 value result is :"+i1);
    }
}
