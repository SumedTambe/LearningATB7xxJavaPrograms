package ex_2026.ex_2026_1.ex_02062026;

import java.util.Scanner;

public class P_017 {
    public static void main(String[] args) {
        //Max number in two input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2 = sc.nextInt();

//        int max = Math.max(num1, num2);
//        System.out.println("Max number is "+ max);

        if(num1 > num2){
            System.out.println("Max number is "+num1);
        }else if(num2 > num1){
            System.out.println("Max number is "+num2);
        }else{
            System.out.println("Both numbers are equal.");
        }
    }
}
