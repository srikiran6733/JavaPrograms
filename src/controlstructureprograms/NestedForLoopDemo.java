package controlstructureprograms;

public class NestedForLoopDemo {

    /**
     * Write a nested for loop program
     */

    public static void nestedForLoopDemo(){
        System.out.println("Started executing the nestedForLoopDemo().....");

        for(int i=1;i<=3;i++){
            for(int j=1;j<=3;j++){
                System.out.println(i+","+j);
            }

        }
    }

    /**
     * Write a program to print rectangular pattern
     * @param
     */
public static void printRectangularPattern(){
    System.out.println("Started executing the printRectangularPattern().....");
    final int ROWSCOUNT=4,COLUMNCOUNT=5;

    for(int i=1;i<=ROWSCOUNT;i++){
        for(int j=1;j<=COLUMNCOUNT;j++){
            System.out.print("*");
        }
        System.out.println();
    }
}

    /**
     * Write a program to print the triangle pattern
     *
     */
public static void printTrianglePattern(){
    System.out.println("Started executing the printTrianglePattern().....");
    final int SIZE=6;
    for(int i=1;i<=SIZE;i++){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
}

    /**
     * Write a program to use break statement
     *
     */
    public static void breakDemo(){
        System.out.println("Started executing the breakDemo()......");
        for(int i=1;i<=10;i++){
            if(i==5){
                System.out.print(i);
                break;
            }
        }
        System.out.println();
    }

    /**
     * Write a program to use break statement
     *
     */
    public static void continueDemo(){
        System.out.println("Started executing the continueDemo()......");
        for(int i=1;i<=10;i++){
            if(i%2==0){
                System.out.print(i+" ");
                continue;
            }
        }
        System.out.println();
    }


    public static void main(String[] args) {

        nestedForLoopDemo();
        printRectangularPattern();
        printTrianglePattern();
        breakDemo();
        continueDemo();
    }
}
