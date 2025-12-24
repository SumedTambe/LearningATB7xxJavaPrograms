package ex_13072024;

import java.util.Scanner;

public class Lab095 {
    public static void main(String[] args) {

        //Take a user input as char and Tell the user if it is vowel

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a char, I will tell you, if it is vowel or not.");
        char user_input = sc.next().charAt(0);

        user_input = Character.toLowerCase(user_input);


        switch (user_input){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("consonant");
        }
        System.out.println("+++ Outside of the switch loop +++");
    }
}
