package ex_2025.ex_12302025.Constructor;

public class Mobile {
    String modal;
    int price;

    Mobile(){
        modal = "Unknown";
        price = 0;
    }

    Mobile(String m, int p){
        modal = m;
        price = p;
    }

    void show(){
        System.out.println(modal + " : " + price);
    }
}
