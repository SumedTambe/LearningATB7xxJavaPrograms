package ex_02192026;

import java.util.Scanner;

public class P_095 {
    public static void main(String[] args) {
        //Matrix Addition (User Input Version)

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row: ");
        int row = sc.nextInt();

        System.out.println("Enter column: ");
        int column = sc.nextInt();

        int[][] A = new int[row][column];
        int[][] B = new int[row][column];
        int[][] C = new int[row][column];

        //Matrix for A
        System.out.println("Enver values for Matrix A: ");
        for(int i=0; i<A.length; i++){
            for(int j=0; j<A[i].length; j++){
                A[i][j] = sc.nextInt();
            }
        }

        //Matrix for B
        System.out.println("Enter values for Matrix B: ");
        for(int r=0; r<B.length; r++){
            for(int s=0; s<B[r].length; s++){
                B[r][s] = sc.nextInt();
            }
        }

        //Sum A+B
        for(int p=0; p<A.length; p++){
            for(int q=0; q<A[p].length; q++){
                C[p][q] = A[p][q] + B[p][q];
            }
        }

        //Print A
        for (int i=0; i<A.length; i++){
            for(int j=0; j<A[i].length; j++){
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();

        //Print B
        for(int i=0; i<B.length; i++){
            for(int j=0; j<B[i].length; j++){
                System.out.print(B[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();

        //Print C
        for(int i=0; i<C.length; i++){
            for(int j=0; j<C[i].length; j++){
                System.out.print(C[i][j]+" ");
            }
            System.out.println();
        }
    }
}
