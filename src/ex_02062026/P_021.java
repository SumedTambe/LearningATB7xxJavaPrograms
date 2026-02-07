package ex_02062026;

import java.util.Scanner;

public class P_021 {
    public static void main(String[] args) {
        //User Input 1-7, will tell what day it is.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number between 1 to 7, I will tell you what day it is.");
        int day = sc.nextInt();

        switch (day){
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thu");
                break;
            case 5:
                System.out.println("Fri");
                break;
            case 6:
                System.out.println("Sat");
                break;
            case 7:
                System.out.println("Sun");
                break;
            default:
                break;
        }
        System.out.println("+++Out of the Switch Loop+++");
    }
}
