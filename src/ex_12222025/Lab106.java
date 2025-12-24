package ex_12222025;

public class Lab106 {
    public static void main(String[] args) {
        //Write a program that prints numbers from 1 to 100,
        //However, for multiplies fo 3, print 'Fizz' instead of the number
        //and for multiplies of 5, print 'Buzz'.
        //For number that are multiplies of both 3 and 5, print 'FizzBuzz'

        int a;
        for(a=1; a<=100; a++) {
            if (a % 3 == 0 && a % 5 != 0) {
                System.out.println("Fizz");
            } else if (a % 5 == 0 && a % 3 != 0) {
                System.out.println("Buzz");
            } else if (a % 3 == 0 && a % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            System.out.println(a);
        }
    }
}
