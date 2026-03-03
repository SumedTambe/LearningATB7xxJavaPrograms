package ex_2026.ex_2026_1.ex_02192026;

public class P_098 {
    public static void main(String[] args) {
        //Pyramid Pattern
//            *
//           ***
//          *****
//         *******
//        *********
        for(int i=1; i<=5; i++){
            for(int j=1; j<=5-i; j++){
                System.out.print(" ");
            }

            for(int r=1; r<=2*i-1; r++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
