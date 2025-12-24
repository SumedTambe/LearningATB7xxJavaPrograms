package ex_12222025;

import java.util.Scanner;

public class Lab107 {
    public static void main(String[] args) {
        //2. Find the Leap Year - 2024

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year in yyyy formate and I will let you know its a leap year or not: ");
        int year = sc.nextInt();

        if(year%4 == 0){
            System.out.println(year +" is a Leap Year.");
        }else {
            System.out.println(year +" is no a Leap Year.");
        }
    }
}
