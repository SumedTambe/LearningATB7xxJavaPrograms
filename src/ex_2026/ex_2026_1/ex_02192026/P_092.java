package ex_2026.ex_2026_1.ex_02192026;

public class P_092 {
    public static void main(String[] args) {
        //Using Nested Loops
        int[][] arr = {
                {10, 20},
                {30, 40}
        };

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
    }
}
