package ex_2026.ex_2026_1.ex_02112026;

import java.util.Scanner;

public class P_072 {
    public static void main(String[] args) {
        //Find Square of a Number: Create a method that takes a number and returns its square.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number, I will give you the square: ");
        int num = sc.nextInt();

        System.out.println(sqr(num));
    }

    static int sqr(int a){
        return a*a;
    }
}
