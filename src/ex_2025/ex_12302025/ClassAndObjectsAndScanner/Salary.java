package ex_2025.ex_12302025.ClassAndObjectsAndScanner;

import java.util.Scanner;

public class Salary {
    int salary;

    void getSalary(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Salary: ");
        salary = sc.nextInt();
        sc.close();
    }

    void calculateBonus(){
        int bonus = salary * 10 /100;
        System.out.println("Bonus: " + bonus);
    }
}
