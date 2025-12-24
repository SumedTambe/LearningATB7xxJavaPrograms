package ex_12222025;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Lab105 {
    public static void main(String[] args) {
        //Enter the char from the user input and let us know its vowel or not.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the char: ");
        char ch = sc.next().charAt(0);
        ch = Character.toLowerCase(ch);

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            System.out.println("vowel");
        }else {
            System.out.println("consonant");
        }
    }
}
