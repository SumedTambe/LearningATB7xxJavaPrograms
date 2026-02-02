package ex_2025.ex_constructor1;

import java.util.Scanner;

public class Lab152 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Salary: ");
        int sal = sc.nextInt();

        Employee emp = new Employee();
        emp.setSalary(sal);
        System.out.println(emp.getSalary());
    }
}
