package ex_2026.ex_2026_1.ex_02082026;

import java.util.Scanner;

public class P_037 {
    public static void main(String[] args) {
//        Leap Year Program (Java)
//        Problem
//        Check whether a given year is a Leap Year.
//        Rules
//        ✔ Divisible by 400 → Leap year
//        ✔ Divisible by 4 but not by 100 → Leap year
//        ❌ Otherwise → Not leap year
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year in yyyy formate: ");
        int year = sc.nextInt();

        if ((year%400==0) || (year%4==0 && year%100 !=0)){
            System.out.println(year+" is a leap year.");
        }else {
            System.out.println(year+" is not a leap year.");
        }
    }
}
