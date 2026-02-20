package ex_02142026;

import java.util.Scanner;

public class P_082 {
    public static void main(String[] args) {
        //Taking Input in Array
        int[] arr = new int[3];

        Scanner sc = new Scanner(System.in);

        for(int i=0; i<arr.length; i++){
            System.out.print("Enter values in array: ");
            arr[i] = sc.nextInt();
        }

        for(int num : arr){
            System.out.println(num);
        }
        sc.close();
    }
}
