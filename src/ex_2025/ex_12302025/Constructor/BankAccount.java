package ex_2025.ex_12302025.Constructor;

public class BankAccount {
    int balance;

    BankAccount(int amount){
        balance = amount;
    }

    void showBalance(){
        System.out.println("Balance " + balance);
    }
}
