package ex_03032026;

public class P_124 {
    public static void main(String[] args) {
        maths m = new maths(10, 20);
        m.add(1,2);
        m.add(2,3, 4);
        m.add(3,4, 5, 6);
    }
}

//Compile-Time Polymorphism | Method Overloading
class maths{
    int a, b;
    maths(int a, int b){
        this.a = a;
        this.b = b;
        System.out.println("a="+a+",b="+b);
    }
    void add(int a, int b){ //two parameters
        System.out.println("a="+a+",b="+b);
    }

    void add(int a, int b, int c){ //three parameters
        System.out.println("a="+a+",b="+b+",c="+c);
    }

    void add(int a, int b, int c, int d){ //four parameters
        System.out.println("a="+a+",b="+b+",c="+c+",d="+d);
    }

}
