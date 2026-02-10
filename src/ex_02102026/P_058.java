package ex_02102026;

public class P_058 {
    public static void main(String[] args) {
        //Even and Odd
        for(int i=1; i<=50; i++){
            if(i%2==0){
                System.out.println("Even-> "+i);
                continue;
            }
            System.out.println("Odd-> "+i);
        }
    }
}
