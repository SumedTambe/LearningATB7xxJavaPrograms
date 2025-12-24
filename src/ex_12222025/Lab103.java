package ex_12222025;

import java.util.Scanner;

public class Lab103 {
    public static void main(String[] args) {
        //Program to Find the Largest Among Three Numbers

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num1: ");
        int num1 = sc.nextInt();

        System.out.println("Enter the num2: ");
        int num2 = sc.nextInt();

        System.out.println("Enter the num 3: ");
        int num3 = sc.nextInt();

        if (num1 > num2 && num1 > num3){
            System.out.println("Largest number is "+ num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("Largest number is "+ num2);
        } else if (num3 > num1 && num3 > num2){
            System.out.println("Largest number is "+num3);
        }else {
            System.out.println("Unable to determine the largest number.");
        }
    }
}
