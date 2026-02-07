package ex_02072026;

import java.util.Scanner;

public class P_029 {
    public static void main(String[] args) {
//        Day Type (Number → Text)
//        Given a day number, return "Weekday" or "Weekend".
//        1–5 → Weekday
//        6–7 → Weekend
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a day in number 1-7: ");
        int day = sc.nextInt();

        String type = switch (day){
            case 1, 2, 3, 4, 5:
                yield "Weekday";
            case 6, 7:
                yield "Weekend";
            default:
                yield "Invalid Day";
        };
        System.out.printf("Given day: %d is a %s", day, type);
        sc.close();
    }
}
