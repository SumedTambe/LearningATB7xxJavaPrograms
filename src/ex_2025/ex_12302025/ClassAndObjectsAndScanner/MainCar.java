package ex_2025.ex_12302025.ClassAndObjectsAndScanner;

import java.util.Scanner;

public class MainCar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Car brand name: ");
        String brand = sc.nextLine();

        System.out.println("Enter Car speed: ");
        int speed = sc.nextInt();

        Car c = new Car("BMW", 150);
        c.show();
    }
}
