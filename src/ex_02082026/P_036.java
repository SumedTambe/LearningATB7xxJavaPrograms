package ex_02082026;

public class P_036 {
    public static void main(String[] args) {
//        FizzBuzz Program (Java)
//        Print numbers from 1 to 100:
//        If number divisible by 3 → Fizz
//        If divisible by 5 → Buzz
//        If divisible by both 3 and 5 → FizzBuzz
//        Else → print the number

        for (int i=1; i<=100; i++){
            if (i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
            } else if (i%3==0) {
                System.out.println("Fizz");
            } else if (i%5==0) {
                System.out.println("Buzz");
            }else {
                System.out.println(i);
            }
        }
    }
}
