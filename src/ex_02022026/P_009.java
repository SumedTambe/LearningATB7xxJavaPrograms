package ex_02022026;

public class P_009 {
    public static void main(String[] args) {
        String s1 = "Testing";
        String s2 = "Testing";
        System.out.println(s1 == s2);

        String s3 = new String("Testing1");
        String s4 = new String("Testing1");
        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4)); //contain check

    }
}
