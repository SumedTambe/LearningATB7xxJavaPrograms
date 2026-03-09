package ex_03032026_2;

public class Dog extends Animal {
    void eat(){
        System.out.println("Dog is eating.");
    }

    void display(){
        super.eat();
    }
}
