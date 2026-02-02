package ex_2025.ex_12302025.ClassAndObjectsAndScanner;

import java.util.Scanner;

public class Student {
    String name;
    int age;

    void getData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name: ");
        name = sc.nextLine();

        System.out.println("Enger Age: ");
        age = sc.nextInt();

        sc.close();
    }

    void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
