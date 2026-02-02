package ex_2025.ex_12282025;

class Student {
    int age;

    void setAge(int age){
        this.age=age;
    }

    void show(){
        System.out.println(age);
    }

    public static void main(String[] args) {
        Student s = new Student();

        s.setAge(30);
        s.show();
    }
}
