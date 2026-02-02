package ex_2025.ex_constructor1;

class Car {
    String name;
    int speed;

    //constructor
    Car(String name1, int speed1){
        this.name=name1;
        this.speed=speed1;
    }
    void display(){
        System.out.println("Brand: "+name);
        System.out.println("Speed: "+speed);
    }
}
