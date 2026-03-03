package ex_2026.ex_2026_1.ex_02232026;

public class P_118 {
    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.eat(); //inherited method from Animal class
        p.bark(); //inherited method from Dog class
        p.weep(); //own method from own class
    }
}

//Example 2: Multilevel Inheritance
class Animal1{
    void eat(){
        System.out.println("Animal is eating.");
    }
}

class Dog1 extends Animal1{
    void bark(){
        System.out.println("Dog is barking.");
    }
}

class Puppy extends Dog1{
    void weep(){
        System.out.println("Puppy is weeping.");
    }
}
