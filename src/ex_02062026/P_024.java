package ex_02062026;

import java.util.Scanner;

public class P_024 {
    public static void main(String[] args) {
//        Mobile Brand Checker
//        Write a Java program that displays the mobile brand based on the model number.
//        Conditions:
//        100, 101, 102 → Nokia
//        200, 201 → Samsung
//        300 → Apple
//        Any other number → Unknown Brand

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your mobile iteam number: ");
        int iteam = sc.nextInt();

        switch (iteam){
            case 100, 101, 102:
                System.out.println("Nokia");
                break;
            case 200, 201:
                System.out.println("Samsung");
                break;
            case 300:
                System.out.println("Apple");
                break;
            default:
                System.out.println("Unknown Brand");
        }
        sc.close();
    }
}
