package practice11;

public class DebugTask5 {

    public static void main(String[] args) {
        Person person = new Person("Alice", 25);
        updateAge(person);
        System.out.println("Updated age: " + person.getAge());
    }
    public static void updateAge(Person person) {
        int currentAge = person.getAge();
        person.setAge(currentAge + 1);
    }
}
class Person {
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() { return name; }

    public int getAge() { return age; }

    public void setAge(int age) {
        this.age = age;
    }
}
