package datatypeprograms;

public class StringOperatorsDemo {

    public static void main(String[] args) {

        //String demo programs
        String s="Java";
        String s1="Selenium";

        String s2=s+s1; //JavaSelenium
        System.out.println("s+s1 expression s2 result value is :"+s2);

        String s3=s+45; //Java45
        System.out.println("s+45 expression s3 result value is :"+s3);

        String s4=s+45+4; //Java454
        System.out.println("s+45+4 expression s4 result value is :"+s4);

        String s5=78+s+4; //78Java4
        System.out.println("78+s+4 expression s5 result value is :"+s5);

        String s6=4+14+s2; //18JavaSelenium
        System.out.println("4+14+s2 expression s6 result value is :"+s6);

        String s7=s+(45+4)+8+s1; //Java498Selenium
        System.out.println("s+(45+4)+8+s2 expression s7 result value is :"+s7);

        String s8=s2+(45+4)+s1+s2; //JavaSelenium49SeleniumJavaSelenium
        System.out.println("s+(45+4)+8+s2 expression s7 result value is :"+s8);
    }
}
