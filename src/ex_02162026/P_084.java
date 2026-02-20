package ex_02162026;

import java.util.Scanner;

public class P_084 {
    public static void main(String[] args) {
        //User input - Store the five subject marks in array and give the average of it

        Scanner sc = new Scanner(System.in);
        float[] subMarks = new float[5];
        float sumMarks = 0;

        for(int i=0; i<subMarks.length; i++){
            System.out.print("Enter the subject: "+ (i+1)+" mark: ");
            subMarks[i] = sc.nextFloat();
            sumMarks = sumMarks + subMarks[i];
        }

        float avgMarks = sumMarks/subMarks.length;
        System.out.println("The Average of Marks: " + avgMarks);
    }
}
