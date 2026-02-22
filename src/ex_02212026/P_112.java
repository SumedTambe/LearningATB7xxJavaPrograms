package ex_02212026;

public class P_112 {
    public static void main(String[] args) {
        //Example 2: Student 🎓
        BankAccount acc = new BankAccount(); //Object
        acc.accountHolder = "Sumed";
        acc.balance = 0;

        acc.deposit(10000.50);
        acc.withdraw(2500.75);
    }
}

class BankAccount{
    //Attribute
    String accountHolder;
    double balance;

    //Behavior
    void deposit(double amount){
        balance += amount;
        System.out.println("New Balance: "+balance);
    }

    void withdraw(double amount){
        balance -= amount;
        System.out.println("New Balance: "+balance);
    }
}
