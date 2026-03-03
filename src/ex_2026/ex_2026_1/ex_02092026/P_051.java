package ex_2026.ex_2026_1.ex_02092026;

public class P_051 {
    public static void main(String[] args) {
        //Nested for Loop
        for(int i=1; i<=3; i++){
            for(int j=1; j<=3; j++){
                for(int r=1; r<=3; r++){
                    for(int s=1; s<=3; s++){
                        System.out.println(i+" "+j+" "+r+" "+s+" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
