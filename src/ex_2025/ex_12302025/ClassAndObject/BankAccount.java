package ex_2025.ex_12302025.ClassAndObject;

public class BankAccount {
    int balance = 1000;

    void deposite(int amount){
        balance += amount;
        System.out.println("Balance after deposite: "+ balance);
    }

    void withdraw(int amount){
        balance -= amount;
        System.out.println("Balance after withdraw: "+balance);
    }
}
