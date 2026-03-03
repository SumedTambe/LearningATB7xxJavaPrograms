package ex_2026.ex_2026_1.ex_02222026;

public class P_114 {
    public static void main(String[] args) {
        Student1 s1 = new Student1("Sumed", 22);
        s1.display();
    }
}

//Example 2: Parameterized Constructor
class Student1{
    String name;
    int age;

    Student1(String n, int a){
        name = n;
        age = a;
    }

    void display(){
        System.out.println(name+" is "+age+" years old.");
    }
}