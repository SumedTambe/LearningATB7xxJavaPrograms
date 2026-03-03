package ex_2026.ex_2026_1.ex_02212026;

public class P_110 {
    public static void main(String[] args) {
        //Example 1: Car 🚗
        Car car1 = new Car(); //Object
        car1.brand = "BMW";
        car1.color = "Black";
        car1.speed = 0;

        car1.start();  //Behavior
        car1.accelerate(); //Behavior
    }
}

class Car{
    //Attribute (Data)
    String brand;
    String color;
    int speed;

    //Behavior
    void start(){
        System.out.println(brand+" is starting...");
    }

    void accelerate(){
        speed += 20;
        System.out.println("Speed is now: "+speed);
    }
}
