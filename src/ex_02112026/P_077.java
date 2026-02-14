package ex_02112026;

import java.util.Scanner;

public class P_077 {
    public static void main(String[] args) {
        //Factorial of a Number: Create a method that returns factorial of a number. e.g. 5! = 120
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number, will give you the factorial: ");
        int num = sc.nextInt();

        System.out.printf("The given number: %d has factorial: "+factorial(num), num);
    }

    static int factorial(int n){
        int fac = 1;
        for(int i=1; i<=n; i++){
            fac = fac * i;
        }
        return fac;
    }
}
