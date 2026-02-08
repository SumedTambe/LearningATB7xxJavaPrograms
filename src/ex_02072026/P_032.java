package ex_02072026;

import java.util.Scanner;

public class P_032 {
    public static void main(String[] args) {
//        Month Days
//        Return number of days in a month.
//        1,3,5,7,8,10,12 → 31
//        4,6,9,11 → 30
//        2 → 28
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a month in number form (1-12): ");
        int month = sc.nextInt();

        int day = switch (month){
            case 1, 3, 5, 7, 8, 10, 12:
                yield 31;
            case 4, 6, 9, 11:
                yield 30;
            case 2:
                yield 28;
            default:
                yield 0;
        };
        System.out.printf("Entered month: %d has a %d days.", month, day);
    }
}
