package ex_02112026;

import java.util.Scanner;

public class P_080 {
    public static void main(String[] args) {
        //Fibonacci Series e.g. 5: 0 1 2 3 5 8...
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number, will give you fibonanachi: ");
        int numForFibo = sc.nextInt();

        fibonnachi(numForFibo);
    }
    static void fibonnachi(int num){ //5
        int a = 0;
        int b = 1;

        for(int i=0; i<=num; i++){
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
