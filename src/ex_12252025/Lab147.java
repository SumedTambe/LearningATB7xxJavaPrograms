package ex_12252025;

import java.util.Scanner;

public class Lab147 {
    public static void main(String[] args) {
        // Program to calculate the average marks of 5 subjects

        Scanner sc = new Scanner(System.in);

        final int TOTAL_SUBJECTS = 5;
        float[] marks = new float[TOTAL_SUBJECTS];
        float totalMarks = 0;

        for (int i = 0; i < TOTAL_SUBJECTS; i++) {
            System.out.print("Enter marks for Subject " + (i + 1) + ": ");
            marks[i] = sc.nextFloat();
            totalMarks += marks[i];
        }

        float average = totalMarks / TOTAL_SUBJECTS;
        System.out.println("Average marks of the subjects: " + average);

        sc.close();
    }
}
