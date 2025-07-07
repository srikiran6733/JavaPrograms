package controlstructureprograms;

public class BranchingDemoPrograms {

    public static int a = 12, b = 25;

    public static void ifDemo() {
        if (a <= b) {
            System.out.println("a is smaller than b");
        } else {
            System.out.println("a is not smaller than b");
        }
    }

    //IfElse demo program
    private void ifElseDemo(long l, long k){
        if(l>k){
            System.out.println(" l is bigger value ");
        }else{
            System.out.println("k is bigger value");
        }
    }

    //if-else-if
    void ifElseIfDemo(){
        int a=123,b=234,c=432;
        if(a<b && b>=c){
            System.out.println("a is bigger value than b ");
        }else if(a<b && b<=c){
            System.out.println("c is bigger value than a,b ");
        }else{
            System.out.println("b is bigger value than a,b ");
        }
    }

    public static void main(String[] args) {
       ifDemo();

       //create an object for the class to call the non static members
        BranchingDemoPrograms sid= new BranchingDemoPrograms();
        sid.ifElseDemo(105,178);
        sid.ifElseIfDemo();

    }
}
