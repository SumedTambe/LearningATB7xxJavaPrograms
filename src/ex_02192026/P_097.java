package ex_02192026;

public class P_097 {
    public static void main(String[] args) {
        //Inverted Right Triangle
//        *****
//        ****
//        ***
//        **
//        *
        for(int i=0; i<5; i++){
            for(int j=5; j>i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
