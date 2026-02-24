package ex_02232026;

import org.w3c.dom.ls.LSOutput;

public class P_120 {
    public static void main(String[] args) {
        Son s = new Son();
        String grandFatherName = s.name1;
        String fatherName = s.name2;
        String sonName = s.name3;
        s.home1();
        s.home2();
        s.home3();
    }
}
//Multilevel Inheritance:
class GrandFather{
    String name1 = "Balu";
    void home1(){
        System.out.println("1BHK");
    }
}
class Father extends GrandFather{
    String name2 = "Ganpat";
    void home2(){
        System.out.println("2BHK");
    }
}
class Son extends Father{
    String name3 = "Sumed";
    void home3(){
        System.out.println("3BHK");
    }
}

