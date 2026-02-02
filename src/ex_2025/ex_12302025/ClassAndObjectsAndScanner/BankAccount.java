package ex_2025.ex_12302025.ClassAndObjectsAndScanner;

import java.util.Scanner;

public class BankAccount {
    int balance;

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter initial balance: ");
        balance = sc.nextInt();
        System.out.println("Initial balance: " + balance);
    }

    void deposit(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter deposit amount: ");
        int amount = sc.nextInt();
        balance += amount;
        System.out.println("Updated balance: " + balance);
    }

    void withdraw(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter withdraw amount: ");
        int amount = sc.nextInt();
        balance -= amount;
        System.out.println("Updated balance: " + balance);
    }
}
