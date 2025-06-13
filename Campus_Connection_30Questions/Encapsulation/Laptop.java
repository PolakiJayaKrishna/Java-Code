//Create a Laptop class where fields like brand and RAM are private, but accessible via methods.

package Encapsulation;

public class Laptop {
    private String brand;
    private int ram;
    Laptop(String brand , int ram){
        this.brand = brand;
        this.ram = ram;
    }
    public String getBrand(){
        return this.brand;
    }
    public int getRam(){
        return this.ram;
    }
    public void display(){
        System.out.println("Laptop Brand is: "  + getBrand());
        System.out.println("RAM:" + getRam() + "GB");
    }
}
class LaptopTest{
    public static void main(String[] args) {
        Laptop laptop = new Laptop("Lenovo", 16);
        laptop.display();
    }
}
