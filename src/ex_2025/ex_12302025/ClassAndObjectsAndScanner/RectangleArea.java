package ex_2025.ex_12302025.ClassAndObjectsAndScanner;

import java.util.Scanner;

public class RectangleArea {
    int width, length;

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rectangle width: ");
        width = sc.nextInt();

        System.out.println("Enter Rectangle length: ");
        length = sc.nextInt();

        sc.close();
    }

    void area(){
        int area = length * width;
        System.out.println("Rectangle Area: " + area);
    }
}
