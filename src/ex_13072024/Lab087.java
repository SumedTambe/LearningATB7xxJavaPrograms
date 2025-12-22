package ex_13072024;

import java.util.Scanner;

public class Lab087 {
    public static void main(String[] args) {
        //Take a user input and check the given number is even or odd.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num: ");
        int user_input = sc.nextInt();

        System.out.println(user_input);

        if(user_input%2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}
