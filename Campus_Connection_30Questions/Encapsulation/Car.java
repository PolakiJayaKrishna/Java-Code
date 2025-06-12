//Define a Car class with private fields brand, speed, and write methods to get and set their values.

package Encapsulation;

public class Car {
    private String brand;
    private int speed;

    public void setname(String brand) {
        this.brand = brand;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getname() {
        return brand;
    }

    public int getspeed() {
        return speed;
    }

    public void display() {
        System.out.println("Car Brand is: " + getname());

        System.out.println("Speed: " + speed);
        if (speed >= 180)
            System.out.println("Drive Slowly...");
        else if (speed >= 100)
            System.out.println("Be Alert! While Driving");
        else if (speed >= 60)
            System.out.println("Good Maintain this Speed...");
        else if (speed <= 0)
            speed = 0;
    }

    public static void main(String[] args) {

        Car car = new Car();
        car.setname("TATA");
        car.setSpeed(100);
        car.display();
    }
}
