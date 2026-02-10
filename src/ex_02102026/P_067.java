package ex_02102026;

public class P_067 {
    public static void main(String[] args) {
        greet();
        System.out.println(getNumber());
        add(10,20);
        System.out.println(multiply(2, 3));
    }


    //Without Parameters & Without Return Type
    static void greet() {
        System.out.println("Hello, Java!");
    }

    //Without Parameters but With Return Type
    static int getNumber(){
        return 10;
    }

    //With Parameters & Without Return Type
    static void add(int a, int b){
        System.out.println("Sum = "+ (a+b));
    }

    //With Parameters & With Return Type
    static int multiply(int a, int b){
        return a*b;
    }
}
