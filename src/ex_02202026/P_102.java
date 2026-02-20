package ex_02202026;

public class P_102 {
    public static void main(String[] args) {
        //Reverse a String

        String str = "Java";
        String reverse = "";

        for(int i=str.length()-1; i>=0; i--){
            reverse = reverse + str.charAt(i);
        }

        System.out.println("Reverse: "+reverse);
    }
}
