package ex_12232025;

import java.util.Scanner;

public class Lab130 {
    public static void main(String[] args) {
        //Factorial Program
        // user input 5 -> 5*4*3*2*1 = 120

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number, I will give you the factorial.");
        int number = sc.nextInt();
        int real_number = number;
        int factorial = 1;
        if (number == 0) {
            System.out.println("Given number: " + real_number + " and its factorial is 0");
        } else {
            for (int i = number; i >= 1; i--) {
                factorial *= i;   //f = f*i
            }
            System.out.println("Given number: " + real_number + " and its factorial is " + factorial);
        }
        sc.close();
    }
}
