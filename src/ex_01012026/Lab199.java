package ex_01012026;

import java.sql.SQLOutput;

public class Lab199 {
    public static void main(String[] args) {
        A a = new A();
        a.age = 12;
        A.discount = 200;
        a.m2();
        A.m1();
    }
}

class A{
    int age = 10;
    static int discount = 199;

    static{
        System.out.println("SIB-A");
    }

    {
        System.out.println("IIB");
    }

    static void m1(){
        System.out.println("static method - m1");
    }

    void m2(){
        System.out.println("without static method - m2");
    }

}