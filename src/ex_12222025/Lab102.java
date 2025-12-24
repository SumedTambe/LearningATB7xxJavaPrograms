package ex_12222025;

import java.util.Scanner;

public class Lab102 {
    public static void main(String[] args) {
        // Take a number from the user and determine its type
        // (Positive, Negative, or Zero)

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter an integer number: ");
        int number = sc.nextInt();

        if (number > 0) {
            System.out.println("The number is Positive.");
        } else if (number < 0) {
            System.out.println("The number is Negative.");
        } else {
            System.out.println("The number is Zero.");
        }

        System.out.println("+++ Program execution completed +++");
        sc.close();
    }
}
