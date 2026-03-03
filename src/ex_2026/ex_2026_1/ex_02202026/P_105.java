package ex_2026.ex_2026_1.ex_02202026;

import java.util.Scanner;

public class P_105 {
    public static void main(String[] args) {
        //Take String Input

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Hello, "+name);

        sc.close();
    }
}
