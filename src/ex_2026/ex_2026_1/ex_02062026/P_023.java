package ex_2026.ex_2026_1.ex_02062026;
import java.util.Scanner;

public class P_023 {
    public static void main(String[] args) {
        //Take user input as char and tell the user if it is a vowel
       Scanner sc = new Scanner(System.in);
        System.out.print("Enter a single character: ");
        char ch = sc.next().toLowerCase().charAt(0);

        if(!Character.isLetter(ch)){
            System.out.println("Please enter a valid alphabet character");
        } else if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("It is a vowel");
        }else {
            System.out.println("It is not a vowel");
        }
        sc.close();
    }
}
