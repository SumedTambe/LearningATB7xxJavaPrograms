package ex_2025.ex_12302025.Constructor;

public class Rectangle {
    int length, width, area;

    Rectangle(int l, int w){
        length = l;
        width = w;
        area = length * width;
    }

    void showArea(){
        System.out.println("Area " + area);
    }
}
