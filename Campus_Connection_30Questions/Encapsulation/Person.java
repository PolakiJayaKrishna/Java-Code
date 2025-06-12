// Create a Person class with private fields: name, age. Provide public getters
    // and setters.

package Encapsulation;

public class Person {
    

    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    void display() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("JayaKrishna");
        person.setAge(20);
        person.display();
    }
}
