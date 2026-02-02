package ex_2025.ex_12302025.ClassAndObjectsAndScanner;

import java.util.Scanner;

public class Calculator {
    int a, b;

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
    }

    void add(){
        int sum = a + b;
        System.out.println("Sum: "+ sum);
    }

    void subtract(){
        int subtract = a - b;
        System.out.println("Substraction: "+ subtract);
    }
}
