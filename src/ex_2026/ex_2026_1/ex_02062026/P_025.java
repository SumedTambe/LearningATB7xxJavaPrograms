package ex_2026.ex_2026_1.ex_02062026;
import java.util.Scanner;

public class P_025 {
    public static void main(String[] args) {
//        Problem 2: Day Type Checker
//        Write a program to check whether a day number is a Weekday or Weekend.
//        Conditions:
//        1, 2, 3, 4, 5 → Weekday
//        6, 7 → Weekend

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day number (1-7): ");

        if(!sc.hasNextInt()){
            System.out.println("You should be enter day number (1-7)");
        }else {
            int day = sc.nextInt();
            switch (day) {
                case 1, 2, 3, 4, 5:
                    System.out.println("Weekday");
                    break;
                case 6, 7:
                    System.out.println("Weekend");
                    break;
                default:
                    System.out.printf("Invalid day number %d", day);
            }
            sc.close();
        }
    }
}
