package ex_2025.ex_12302025.Inheritance;

class Animal {
    //Inheritance
    //Create parent Animal and child Dog.

    void eat(){
        System.out.println("Eating");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("Barking");
    }
}

class Test{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.bark();
    }
}
