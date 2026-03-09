package ex_03032026;

class Animal1 {
    String color = "White";
}

class Dog extends Animal1 {
    String color = "Black";

    void showColor() {
        System.out.println(super.color); // parent class variable
    }
}

public class P_126 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.showColor();
    }
}