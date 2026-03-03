package ex_2026.ex_2026_1.ex_02222026;

public class P_116 {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.display();

        Person p2 = new Person("Sumed", 23);
        p2.display();
    }
}

//Example 4: Constructor Overloading
class Person{
    String name;
    int age;

    Person(){
        name = "Unknown";
        age = 0;
    }

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    void display(){
        System.out.println(name+" is "+age+" years old.");
    }
}
