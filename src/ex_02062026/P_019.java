package ex_02062026;

import java.util.Scanner;

public class P_019 {
    public static void main(String[] args) {
//        Grade Calculator:
//        Write a program that calculates and displays
//        the letter grade for a given numerical score
//        (e.g., A, B, C, D, or F) based on the following
//        grading scale:
//        A: 90–100
//        B: 80–89
//        C: 70–79
//        D: 60–69
//        F: 0–59

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your numerical score: ");
        int score = sc.nextInt();

        if(score >= 0 && score<=100){
            if(score>=0 && score<=59){ //F: 0–59
                System.out.printf("Your Grade as per score:(%d) is F", score);
            } else if (score>=60 && score<=69) { //D: 60–69
                System.out.printf("Your Grade as per score:(%d) is D", score);
            } else if (score>=70 && score<=79) { //C: 70–79
                System.out.printf("Your Grade as per score:(%d) is C", score);
            } else if (score>=80 && score<=89) { //B: 80–89
                System.out.printf("Your Grade as per score:(%d) is B", score);
            } else { //A: 90–100
                System.out.printf("Your Grade as per score:(%d) is A", score);
            }
        }else {
            System.out.println("Incorrect Score!!! It should be 0-100, Score: "+score);
        }
    }
}
