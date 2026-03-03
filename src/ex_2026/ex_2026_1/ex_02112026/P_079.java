package ex_2026.ex_2026_1.ex_02112026;

import java.util.Scanner;

public class P_079 {
    public static void main(String[] args) {
        //Reverse a Number
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter a number, will share you the reverse order: ");
        int giveNum = sc.nextInt();
        int reversNum = reverseNumber(giveNum);
        System.out.printf("The give number: %d and its reverse oder: %d",giveNum, reversNum);
    }

    static int reverseNumber(int num){
        int rev = 0;
        for(;num!=0;){
            int digit = (num%10); //get the last digit
            rev = ((rev * 10) + digit); // build revese
            num = (num/10); //remove last digit
        }
        return rev;
    }
}
