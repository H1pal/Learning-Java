package thisDemo;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    Person() {
        this("이하랑", 17);
    }
}
