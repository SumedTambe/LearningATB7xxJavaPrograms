package ex_13072024;

import java.util.Scanner;

public class Lab092 {
    public static void main(String[] args) {
        //Triangle Classifier
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the triangle's 1st side lenght: ");
        float lenght1 = sc.nextFloat();

        System.out.println("Enter the triangle's 2nd side lenght: ");
        float lenght2 = sc.nextFloat();

        System.out.println("Enter the triangle's 3rd side lenght: ");
        float lenght3 = sc.nextFloat();

        if(lenght1 == lenght2 && lenght1 == lenght3){
            System.out.println("Triangle is equilateral");
        } else if (lenght1 == lenght2 && lenght1 != lenght3) {
            System.out.println("Triangle is isosceles");
        } else if (lenght1 == lenght3 && lenght1 != lenght2) {
            System.out.println("Triangle is isosceles");
        }else {
            System.out.println("Triangle is scalene");
        }
    }
}
