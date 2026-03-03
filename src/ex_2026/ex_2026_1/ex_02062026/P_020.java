package ex_2026.ex_2026_1.ex_02062026;

import java.util.Scanner;

public class P_020 {
    public static void main(String[] args) {
//        Triangle Classifier:
//        Write a program that classifies a triangle based on its side lengths.
//        Given three input values representing the lengths of the sides,
//        determine if the triangle is equilateral (all sides are equal),
//        isosceles (exactly two sides are equal), or
//        scalene (no sides are equal).Use an if-else statement to classify the triangle.

        Scanner sc = new Scanner(System.in);
        System.out.println("Give the side lengths of the triangle");
        System.out.print("Enter sl1: ");
        int sl1 = sc.nextInt();

        System.out.print("Enter sl2: ");
        int sl2 = sc.nextInt();

        System.out.print("Enter sl3: ");
        int sl3 = sc.nextInt();

        String tri_name = null;

        //check valid triangle
        if(sl1 + sl2 <= sl3 || sl1 + sl3 <= sl2 || sl2 + sl3 <= sl1){
            System.out.println("Not a valid triangle.");
        }
        if(sl1 == sl2 && sl1 == sl3){ //equilateral (all sides are equal)
            tri_name = "all sides are equal: equilateral";
        } else if (sl1 == sl2 || sl2 == sl3 || sl1 == sl3){ //isosceles (exactly two sides are equal)
            tri_name = "exactly two sides are equal: isosceles";
        } else{ //scalene (no sides are equal)
            tri_name = "no sides are equal: scalene";
        }
        System.out.println(tri_name);
    }
}
