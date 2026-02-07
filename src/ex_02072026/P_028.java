package ex_02072026;

import java.util.Scanner;

public class P_028 {
    public static void main(String[] args) {
//        Grade Value:
//        Given a grade character, return its numeric value.
//        'A' → 90
//        'B' → 80
//        'C' → 70
//        Others → 0
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your grade from A-C: ");
        char grade = sc.next().toUpperCase().charAt(0);

        int per = switch (grade){
            case 'A':
                yield 90;
            case 'B':
                yield 80;
            case 'C':
                yield 70;
            default:
                yield 0;
        };
        System.out.printf("As per grade, your percentage is %d", per);
    }
}
