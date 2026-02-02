package ex_2025.ex_12272025;

public class Person {
    String name;
    int age;
    float height;
    float weight;

    Person() {
        System.out.println("This is the factory of Person creation.");
    }

    Person(String nameGiven, int ageGiven, float heightGiven, float weightGiven){
        this.name = nameGiven;
        this.age = ageGiven;
        this.height = heightGiven;
        this.weight = weightGiven;

        System.out.println("Person name is "+name);
    }

}
