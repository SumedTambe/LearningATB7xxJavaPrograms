package ex_03032026_3;

public class Dog extends Animal {
    String color = "Black";

    Dog(){
        super();
        System.out.println("Dog Constructor");
        System.out.println(super.color);
    }
}
