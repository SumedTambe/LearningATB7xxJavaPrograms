package ex_13072024;

import java.util.Scanner;

public class Lab088 {
    public static void main(String[] args) {
        // Max num bwt two input
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Num1: ");
        int num1 = sc.nextInt();

        System.out.println("Enter Num2: ");
        int num2 = sc.nextInt();

        System.out.println("Your Entered Num1: " + num1);
        System.out.println("Your Entered Num2: " + num2);

//        System.out.println("Max Num: "+ (Math.max(num1, num2)));
        
        if(num1 > num2){
            System.out.println(num1 + " is greater than " + num2);
        }else if(num1 < num2) {
            System.out.println(num2 + " is greater than " + num1);
        }else {
            System.out.println("Both entered values are equal.");
        }

    }
}
