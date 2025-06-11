package OOPS.Encapsulation;

public class Vehicle {
    private String model;
    private int speed = 0;

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void accelerate(int acc) {
        this.speed = this.speed + acc;
        if (speed > 180) {
            speed = 180;
            System.out.println("Speed capped at 180 km/h for safety.");
        }
    }

    public void brake(int slow) {
        this.speed = this.speed - slow;
        if (speed < 0)
            speed = 0;
    }

    public int getSpeed() {
        return speed;
    }

    public static void main(String[] args) {
        Vehicle obj = new Vehicle();
        obj.setModel("Honda City");
        obj.accelerate(50);
        obj.brake(20);
        System.out.println(obj.getModel() + "\n" + obj.getSpeed());
    }
}
