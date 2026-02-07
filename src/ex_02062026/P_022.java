package ex_02062026;

import java.util.Scanner;

public class P_022 {
    public static void main(String[] args) {
        //Enter browser name
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter browser name, that you want to run the programe: ");
        String bro_name = sc.next();
        bro_name = bro_name.toLowerCase();

        switch (bro_name) {
            case "chrome":
                System.out.println("Application is running on Chrome Browser.");
                break;
            case "firefox":
                System.out.println("Application is running on Firefox Browser.");
                break;
            case "opera":
                System.out.println("Application is running on Opera Browser.");
                break;
            default:
                System.out.println("Application is running on Unknown Browser.");
                break;
        }
    }
}
