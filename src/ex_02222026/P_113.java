package ex_02222026;

public class P_113 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.display();
    }
}

//Example 1: Default Constructor
class Student{
    String name;
    int age;

    Student(){
        name = "Rahul";
        age = 21;
    }

    void display(){
        System.out.println(name+" is "+age+" years old.");
    }
}
