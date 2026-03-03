package ex_03032026;

public class P_125 {
    public static void main(String[] args) {
       animal a = new labbra();
       a.sound(); // Labbra > bark-loud

        a = new dog();
        a.sound(); //Dog > bark

        a = new animal();
        a.sound(); //Animal > voice
    }
}

//Run-Time Polymorphism | Method Overriding
class animal{
         void sound(){
             System.out.println("Animal > voice");
         }
}

class dog extends animal{
    void sound(){
        System.out.println("Dog > bark");
    }
}

class labbra extends dog{
    void sound(){
        System.out.println("Labbra > bark-loud");
    }
}

