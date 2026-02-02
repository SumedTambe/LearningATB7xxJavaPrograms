package ex_2025.ex_constructor1;

public class Lab154 {
    public static void main(String[] args) {
        Animal a;
        a = new Cat();
        a.sound();

        a = new Animal();
        a.sound();

        Cat c = new Cat();
        c.test();
    }
}
