package ex_2026.ex_2026_1.ex_02112026;

import java.util.Scanner;

public class P_075 {
    public static void main(String[] args) {
        //Simple Interest Calculator: Write a method: SI = (P × R × T) / 100. Return the Simple Interest.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Principle Amt.: ");
        double priAmt = sc.nextDouble();

        System.out.print("Enter a Rate of Interest: ");
        double rateInt = sc.nextDouble();

        System.out.print("Enter a period/time in month: ");
        double timeInMonth = sc.nextDouble();

        double SI = calSimpleInt(priAmt, rateInt, timeInMonth);
        System.out.println(SI);
    }

    static double calSimpleInt(double P, double R, double T){
        return ((P*R*T)/100);
    }
}
