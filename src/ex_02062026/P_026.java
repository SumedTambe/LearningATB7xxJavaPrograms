package ex_02062026;

import java.util.Scanner;

public class P_026 {
    public static void main(String[] args) {
        //cha is a vowel or not
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().toLowerCase().charAt(0);

        if (!Character.isLetter(ch)){
            System.out.println("Enter a alphabet character only.");
            sc.close();
            return;
        }
            switch (ch){
                case 'a','e','i','o','u' -> System.out.println("Vowel");
                default -> System.out.println("Not vowel");
            }

        sc.close();
    }
}
