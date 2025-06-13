//1. Create a base class Animal with a method sound(). Derive Dog and Cat classes and override the method.
package Inheritance;

public class Animal {
    public void sound(){
        System.out.println("Sound...");
    }
}
class Dog extends Animal{
    @Override
    public void sound() {
        System.out.println("Braking...");
    }
}
class Cat extends Animal{
    @Override
    public void sound(){
        System.out.println("Meow....");
    }   
}
class Main{
    public static void main(String[] args) {
        Animal obj = new Dog();
        obj.sound();
        Animal obj1 = new Cat();
        obj1.sound();
    }
}