package ex_02072026;

import java.util.Scanner;

public class P_031 {
    public static void main(String[] args) {
//        Character Category
//        Return category of character:
//        Vowel → "Vowel"
//        Consonant → "Consonant"
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character (a-z): ");
        char ch = sc.next().toLowerCase().charAt(0);

        String type = switch (ch){
            case 'a', 'e', 'i', 'o', 'u':
                yield "Vowel";
            default:
                yield "Consonant";
        };
        System.out.printf("Entered character is %c and its type is %s", ch, type);
    }
}
