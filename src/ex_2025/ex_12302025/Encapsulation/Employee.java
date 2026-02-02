package ex_2025.ex_12302025.Encapsulation;

public class Employee {
    //Practice 2: Encapsulation
    //Hide salary and access it safely.

    private int salary;

    public void setSalary(int salary) {
        if (salary > 0) {
            this.salary = salary;
        }
    }

    public int getSalary() {
        return salary;
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.setSalary(50000);
        System.out.println("Salary: " + e.getSalary());
    }
}
