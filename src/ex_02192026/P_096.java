package ex_02192026;

public class P_096 {
    public static void main(String[] args) {
        //Right Triangle Star Pattern
//        *
//        **
//        ***
//        ****
        int[][] star = new int[4][4];

        for(int i=0; i<=4; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
