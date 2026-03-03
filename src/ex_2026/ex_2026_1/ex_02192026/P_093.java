package ex_2026.ex_2026_1.ex_02192026;

import java.util.Scanner;

public class P_093 {
    public static void main(String[] args) {
        //Taking Input
        int[][] arr = new int[2][2];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 4 numbers: ");
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        System.out.println("Give 2D Array:");
        for(int r=0; r<arr.length; r++){
            for(int s=0; s<arr[r].length; s++){
                System.out.print(arr[r][s]+" ");
            }
            System.out.println();
        }
    }
}
