package ex_2026.ex_2026_1.ex_02192026;

public class P_094 {
    public static void main(String[] args) {
//        Matrix A        Matrix B        Result
//        1  2            5  6            6  8
//        3  4      +     7  8      =    10 12

        int[][] A = {{1, 2},{3, 4}};
        int[][] B = {{5, 6},{7, 8}};

        int[][] C = new int[2][2];

        //Sum
        for(int i=0; i<A.length; i++){
            for(int j=0; j<A[i].length; j++){

                C[i][j] = A[i][j] + B[i][j];
            }
        }

        //Print Result
        for(int r=0; r<C.length; r++){
            for(int s=0; s<C[r].length; s++){
                System.out.print(C[r][s]+" ");
            }
            System.out.println();
        }
    }
}
