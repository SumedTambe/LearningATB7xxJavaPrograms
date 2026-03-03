package ex_2026.ex_2026_1.ex_02112026;

import java.util.Scanner;

public class P_73 {
    public static void main(String[] args) {
        //Even or Odd: Create a method that takes a number and returns "Even" or "Odd".
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number, I will tell you its an Even or Odd: ");
        int num = sc.nextInt();

        String result = findEvenOdd(num);
        System.out.println(result);
    }

    static String findEvenOdd(int a){
        return ((a%2==0) ? "Even": "Odd");
    }
}
