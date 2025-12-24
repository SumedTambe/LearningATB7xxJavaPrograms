package ex_13072024;

import java.util.Locale;
import java.util.Scanner;

public class Lab094 {
    public static void main(String[] args) {
        //Switch
        // Enter the browser name to execute the test cases.

        // Browser -> chrome, firefox, edge, safari, ect.

        Scanner sc = new Scanner(System.in);
        System.out.println("Which browser you want to execute the test cases?: ");
        String brower = sc.next();
        brower = brower.toLowerCase();

        switch (brower){
            case "chrome":
                System.out.println("Starting the chrome browser.");
                break;
            case "edge":
                System.out.println("Starting the chrome browser.");
                break;
            case "safari":
                System.out.println("Starting the chrome browser.");
                break;
            default:
                System.out.println("Starting "+brower+" brower.");
        }

        System.out.println("+++ Outside the switch loop +++");

    }
}
