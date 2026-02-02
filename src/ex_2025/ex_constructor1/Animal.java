package ex_2025.ex_constructor1;

class Animal {
    void sound(){
        System.out.println("Animal Sound.");
    }
}

class Cat extends Animal{
    @Override
    void sound(){
        System.out.println("Meow");
    }

    void test(){
        System.out.println("test");
    }
}


