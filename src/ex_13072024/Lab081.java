package ex_13072024;
import java.lang.Math;

public class Lab081 {
    public static void main(String[] args) {
        double sq = Math.sqrt(25); //Math.sqrt(x)
        System.out.println(sq);

        int result = Math.max(10,20); //Math.max(x,y)
        System.out.println(result);

        int result1 = Math.min(10,20); //Math.min(x,y)
        System.out.println(result1);

        double result2 = Math.abs(-4.5); //Math.abs(x)
        System.out.println(result2);

        double result3 = Math.pow(2,3); //Math.pow(x, y)
        System.out.println(result3);

        double result4 = Math.round(4.5); //Math.round(x)
        double result5 =Math.ceil(4.1); //Math.ceil(x)
        double result6 =Math.floor(4.1); //Math.floor(x)
        System.out.println("4.5 Round " + result4);
        System.out.println("4.1 Ceil " + result5);
        System.out.println("4.1 Floor " + result6);

        //Random Numbers
        double random_no = Math.random();   //0.0 to 1.0
        System.out.println(random_no);

        int randomNum = (int)(Math.random() * 101); // 0 to 100
        System.out.println(randomNum);


    }
}
