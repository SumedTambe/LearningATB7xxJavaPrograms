package ex_2025.ex_12302025.ClassAndObject;

public class Student {
    String name;
    int age;

    void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Sumed";
        s.age = 33;
        s.display();
    }
}
