package ex_02082026;

import java.util.Scanner;

public class P_034 {
    public static void main(String[] args) {
        //Find positive, negative or zero
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if(num > 0){
            System.out.println("Positive");
        } else if (num < 0) {
            System.out.println("Negative");
        }else{
            System.out.println("Zero");
        }
    }
}
