package OOPS.Abstraction;

//Q2: Abstract Method with Multiple Implementations
public abstract class Animal{
    String name;
    public abstract void makeSound();
    public void displayInfo(){
        System.out.println("Animal Name: " +name);
    }
}
class Dog extends Animal {
    @Override
    public void makeSound() {
         name ="Dog";
        System.out.println("Braking");
    }
}

class Cat extends Animal{
    @Override
    public void makeSound() {
         name = "Cat";
        System.out.println("Meow");
    }
}
class AnimalDemo{
    public static void main(String[] args) {
        Cat obj = new Cat();
        obj.makeSound();
        obj.displayInfo();

        Dog obj1 = new Dog();
        obj1.makeSound();
        obj1.displayInfo();

    }
}