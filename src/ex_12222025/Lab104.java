package ex_12222025;

import java.util.Scanner;

public class Lab104 {
    public static void main(String[] args) {
        //Program to Find the Largest Among Three Numbers  -  using if and switch condition

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1 = sc.nextInt();

        System.out.println("Enter number 2: ");
        int num2 = sc.nextInt();

        System.out.println("Enter number 3: ");
        int num3 = sc.nextInt();

        int result;

        if(num1 > num2 && num1 > num3){
            result = 1;
        } else if (num2 > num3 && num2 > num1) {
            result = 2;
        } else {
            result = 3;
        }

        switch (result){
            case 1 -> System.out.println("Largest number is: "+num1);
            case 2 -> System.out.println("Largest number is: "+num2);
            case 3 -> System.out.println("Largest number is: "+num3);
            default -> System.out.println("Unable to determine the largest number.");
        }
        sc.close();
    }
}
