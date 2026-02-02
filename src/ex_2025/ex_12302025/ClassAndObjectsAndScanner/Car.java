package ex_2025.ex_12302025.ClassAndObjectsAndScanner;

public class Car {
    String brand;
    int speed;

    Car(String brand, int speed){
        this.brand = brand;
        this.speed = speed;
    }

    void show(){
        System.out.println(brand + " speed is " + speed);
    }
}
