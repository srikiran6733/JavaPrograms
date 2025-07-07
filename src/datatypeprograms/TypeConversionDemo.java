package datatypeprograms;

public class TypeConversionDemo {

    public static void main(String[] args) {
        int i=15;
        byte b= (byte) i;
        System.out.println("Byte b value is :"+b);

        byte b1=10;
        int i1=b1;
        System.out.println(" i1 value is :"+i1);

        double d=10.56;
        long l= (long) d;
        System.out.println(" long l value is :"+l);

        long l1=15;
        double d1=l1;
        System.out.println(" double d1 value is :"+d1);

        short sh=15;
        float f=sh;
        System.out.println(" float f value is :"+f);

        float f1=65.8F;
        double d2=f1;
        System.out.println(" double d2 value is :"+d2);
    }
}
