package datatypeprograms;

public class OperatorsDemo {
public static int g=25,s=10;

    public static void main(String[] args) {

        //Arithmatic operators
        int addition =g+s;  //35
        System.out.println("g+s expression addition result value is :"+addition);

        int sub =g-s;   //15
        System.out.println("g-s expression addition result value is :"+sub);

        int div =g/s; //2
        System.out.println("g/s expression addition result value is :"+div);

        int multiplication =g*s;    //250
        System.out.println("g*s expression addition result value is :"+multiplication);

        //conditional operators

        boolean g1 =g>s;    //true
        System.out.println("g>s expression addition result value is :"+g1);

        boolean g2 =g<s;    //false
        System.out.println("g<s expression addition result value is :"+g2);

        boolean g3 =g==s;   //false
        System.out.println("g==s expression addition result value is :"+g3);

        boolean g4 =g>=s;   //true
        System.out.println("g>=s expression addition result value is :"+g4);

        boolean g5 =g<=s;   //false
        System.out.println("g<=s expression addition result value is :"+g5);

        //Conditional operators

        boolean g6 =(g>s) && (g<18);    //false
        System.out.println("g>s) && (g<18) expression addition result value is :"+g6);

        boolean g7 =(g>s) && (s<18);    // true
        System.out.println("(g>s) && (s<18) expression addition result value is :"+g7);

        boolean g8 =(g>s) || (g<18);    // true
        System.out.println("(g>s) || (g<18) expression addition result value is :"+g8);

        boolean g9 =(g7 != g8);   // false
        System.out.println("g>=s expression addition result value is :"+g9);

    }
}
