package ex_02222026;

public class P_115 {
    public static void main(String[] args) {
        Car c1 = new Car("BMW", 500000.50);
        c1.show();
    }
}

//Example 3: Constructor Using this Keyword
class Car{
    String brand;
    double price;

    Car(String brand, double price){
        this.brand = brand;
        this.price = price;
    }

    void show(){
        System.out.println("Brand: "+brand);
        System.out.println("Price: "+price);
    }
}