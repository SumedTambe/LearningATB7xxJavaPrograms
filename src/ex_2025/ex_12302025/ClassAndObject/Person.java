package ex_2025.ex_12302025.ClassAndObject;

class Person {
    String name;
    int age;

    void show(){
        System.out.println(name+" "+age);
    }

    public static void main(String[] args) {
        Person p = new Person();
        p.name = "Sumed";
        p.age = 33;
        p.show();
    }
}

