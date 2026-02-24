package ex_02232026;

public class P_117 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat(); //inherited method
        d.bark(); //own method
    }
}

//Example 1: Simple Inheritance
class Animal{
    void eat(){
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("Dog is barking");
    }
}