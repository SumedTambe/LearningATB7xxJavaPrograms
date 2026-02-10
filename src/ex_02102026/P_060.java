package ex_02102026;

import java.util.Scanner;

public class P_060 {
    public static void main(String[] args) {
        //Factorial Program
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number, will give you factorial value: ");
        int num = sc.nextInt();

        int fval = 1;
        for(int i=1; i<=num; i++){
            fval = fval * i;
        }
        System.out.println(fval);
    }
}
