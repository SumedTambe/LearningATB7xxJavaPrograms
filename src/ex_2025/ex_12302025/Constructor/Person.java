package ex_2025.ex_12302025.Constructor;

public class Person {
    int age;

    Person(int age){
        this.age = age;
    }

    void check(){
        if(age>=18){
            System.out.println("Adult");
        }else{
            System.out.println("Minor");
        }
    }
}
