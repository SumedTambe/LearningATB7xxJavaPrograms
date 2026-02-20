package ex_02202026;

public class P_103 {
    public static void main(String[] args) {
        //Check Palindrome String

        String str = "madam";
        String reverse = "";

        for(int i=str.length()-1; i>=0; i--){
            reverse = reverse + str.charAt(i);
        }

        if(str.equals(reverse)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}
