package ex_2025.ex_12302025.ClassAndObjectsAndScanner;

import java.util.Scanner;

public class Grade {
    int marks;

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks: ");
        marks = sc.nextInt();
    }

    void result(){
        if(marks >= 35){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }
    }
}
