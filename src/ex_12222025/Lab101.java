package ex_12222025;

import java.util.Scanner;

public class Lab101 {
    public static void main(String[] args) {
        //Write a program name, age, salary - print it.
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String user_name = sc.next();

        System.out.println("Enter your age: ");
        byte user_age = sc.nextByte();

        System.out.println("Enter your salary: ");
        int user_salary = sc.nextInt();

        System.out.println("Nmae: "+ user_name);
        System.out.println("Age: "+ user_age);
        System.out.println("Salary: "+ user_salary);

        sc.close();
    }
}
