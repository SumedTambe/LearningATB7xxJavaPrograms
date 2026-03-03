package ex_2026.ex_2026_1.ex_02112026;

import java.util.Scanner;

public class P_076 {
    public static void main(String[] args) {
        //Check Vowel: Create a method that takes a character and returns true if it is a vowel.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character, if Vowel: true or Consonant: false: ");
        char ch = sc.next().charAt(0);

        boolean vow = findVowel(ch);
        System.out.println(vow);
    }
    static boolean findVowel(char a){
        a = Character.toLowerCase(a);
        return (a=='a'|| a=='e' || a=='i' || a=='o' || a=='u') ? true : false;
    }
}
