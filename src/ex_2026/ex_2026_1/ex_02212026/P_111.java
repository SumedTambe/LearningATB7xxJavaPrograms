package ex_2026.ex_2026_1.ex_02212026;

public class P_111 {
    public static void main(String[] args) {
        //Example 1: Car 🚗
        Student s1 = new Student();

        s1.name = "Rahul";
        s1.marks = 90;

        s1.study();
        s1.displayResult();
    }
}

class Student{
    //Attributes
    String name;
    int marks;

    //Behavior
    void study(){
        System.out.println(name+" is studying.");
    }

    void displayResult(){
        System.out.println("Marks: "+marks);
    }
}
