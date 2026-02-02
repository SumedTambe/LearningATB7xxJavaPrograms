package ex_2025.ex_12282025.Abstraction;

class Car extends Engine{

    void drive(){
        engineWork();
        gearWor();
    }

    @Override
    void engineWork() {
        System.out.println("Engine is working.");
    }

    @Override
    void gearWor() {
        System.out.println("Gear is working.");
    }
}
