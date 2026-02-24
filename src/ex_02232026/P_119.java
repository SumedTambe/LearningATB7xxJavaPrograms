package ex_02232026;

public class P_119 {
    public static void main(String[] args) {
        Child c = new Child();
    }
}

//super Example
class Parent{
    Parent(){
        System.out.println("Parent Constructor");
    }
}

class Child extends Parent{
    Child(){
        super();
        System.out.println("Child Constructor");
    }
}

