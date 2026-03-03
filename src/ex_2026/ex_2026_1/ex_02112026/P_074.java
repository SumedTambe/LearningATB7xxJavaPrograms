package ex_2026.ex_2026_1.ex_02112026;

import java.util.Scanner;

public class P_074 {
    public static void main(String[] args) {
        //Find Maximum of Two Numbers: Create a method that takes two numbers and returns the greater one.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.println(findGreaterNum(num1, num2));
    }

    static int findGreaterNum(int a, int b){
        return (a>b) ? a : b;
    }
}
