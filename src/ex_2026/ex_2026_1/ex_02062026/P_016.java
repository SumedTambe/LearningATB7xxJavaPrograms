package ex_2026.ex_2026_1.ex_02062026;

import java.util.Scanner;

public class P_016 {
    public static void main(String[] args) {
        //Take user Input in number and check its an even or odd number.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if(num>1 || num<1) {
            if (num % 2 == 0) {
                System.out.println("The entered number is even: " + num);
            } else {
                System.out.println("The entered number is odd: " + num);
            }
        } else{
            System.out.println("The entered number is zero.");
        }
    }
}
