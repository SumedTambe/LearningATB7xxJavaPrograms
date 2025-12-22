package ex_13072024;

import java.util.Scanner;

public class Lab090 {
    public static void main(String[] args) {
        // Grade Calculator
        // A: 90-100, B: 80-89, C: 70-79, D: 60-69, F: 0-59

        System.out.println("Enter your score in between 0-100: ");
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();

        if(score>=90 && score<=100){
            System.out.println("Grade: A");
        } else if (score>=80 && score<=89) {
            System.out.println("Grade: B");
        } else if (score>=70 && score<=79) {
            System.out.println("Grade: C");
        } else if (score>=60 && score<=69) {
            System.out.println("Grade: D");
        } else if (score>=0 && score<=59) {
            System.out.println("Grade: F");
        }else {
            System.out.println("Invalid Input score.");
        }
        sc.close();
    }
}
