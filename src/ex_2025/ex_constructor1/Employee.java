package ex_2025.ex_constructor1;

public class Employee {
    private int salary;

    public void setSalary(int salary1){
        if(salary1>0){
            this.salary=salary1;
        }
    }

    public int getSalary(){
        return salary;
    }

}
