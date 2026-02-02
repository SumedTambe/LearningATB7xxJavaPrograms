package ex_2025.ex_12302025.Class_And_Object;

public class Person {
    //Practice 1: Class & Object
    //Create a class Person with name and age. Print details.

    String name;
    int age;

    void show(){
        System.out.println(name + " " + age);
    }

    public static void main(String[] args) {
        Person p = new Person();
        p.name = "Sumed";
        p.age = 33;
        p.show();
    }
}
