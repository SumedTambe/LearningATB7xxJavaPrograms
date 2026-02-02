package ex_2025.ex_12302025.ClassAndObject;

public class MainCar {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.brand = "BMW";
        c1.speed = 120;

        Car c2 = new Car();
        c2.brand = "Audi";
        c2.speed = 150;

        c1.show();
        c2.show();
    }
}
