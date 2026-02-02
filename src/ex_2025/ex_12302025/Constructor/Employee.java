package ex_2025.ex_12302025.Constructor;

public class Employee {
    String name;
    int salary;

    Employee(String n, int s){
        name = n;
        salary = s;
    }

    void show(){
        System.out.println(name + " earns " + salary);
    }
}
