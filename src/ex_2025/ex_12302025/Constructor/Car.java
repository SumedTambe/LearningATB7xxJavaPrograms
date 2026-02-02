package ex_2025.ex_12302025.Constructor;

public class Car {
    String brand;
    int speed;

    Car(String brand, int speed){
        this.brand = brand;
        this.speed = speed;
    }

    void display(){
        System.out.println(brand + " speed is " + speed);
    }
}
