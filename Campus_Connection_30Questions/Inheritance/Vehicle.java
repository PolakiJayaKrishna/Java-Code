//2. Write a Vehicle class and a Car subclass that inherits it using the extends keyword.
package Inheritance;

public class Vehicle {
    String carColour = "Red";
    String model = "A1158";
    String numberPlate = "AP16FL3685";

    void display() {
        System.out.println("Car Colour is: " + carColour);
        System.out.println("Model is: " + model);
        System.out.println("Numberplate is: " + numberPlate);
    }
}

class Car extends Vehicle {
    public static void main(String[] args) {
        Car car = new Car();
        car.display();
    }
}
