package ex_2026.ex_2026_1.ex_02202026;

public class P_104 {
    public static void main(String[] args) {
        //Count Vowels in a String

        String str = "Java Programming";
        str = str.toLowerCase();

        int count = 0;

        for(int i=0; i<=str.length()-1; i++){
            char ch = str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
            }
        }
        System.out.println("Total Vowels: "+count);
    }
}
