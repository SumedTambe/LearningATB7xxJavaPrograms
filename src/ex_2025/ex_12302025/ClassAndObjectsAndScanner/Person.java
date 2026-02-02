package ex_2025.ex_12302025.ClassAndObjectsAndScanner;

import java.util.Scanner;

public class Person {
    String name;
    int age;

    Person() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name: ");
        name = sc.nextLine();

        System.out.println("Enter Age: ");
        age = sc.nextInt();

        sc.close();
    }

    void show() {
        System.out.println("Your name is " + name);
        System.out.println("Your age is " + age);
    }
}
