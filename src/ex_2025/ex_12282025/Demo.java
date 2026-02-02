package ex_2025.ex_12282025;

public class Demo {
    Demo(){
        this(10);
        System.out.println("Default Constructor.");
    }

    Demo(int x){
        System.out.println("Value: "+ x);
    }

    public static void main(String[] args) {
        Demo d = new Demo();
    }
}
