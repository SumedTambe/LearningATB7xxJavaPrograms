package ex_2025.ex_12302025.PolymorphismOverriding;

class Vehicle {
    //Polymorphism (Overriding)
    //Override a method and call using parent reference.
    void start(){
        System.out.println("Vehicle starts.");
    }
}

class Bike extends Vehicle{
    void start(){
        System.out.println("Bike starts.");
    }
}

class Test{
    public static void main(String[] args) {
        Vehicle v = new Bike();
        v.start();
    }
}
