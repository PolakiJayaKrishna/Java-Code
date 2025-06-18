package OOPS.Abstraction;

public  abstract class  Shape {
    public abstract void calculateArea();
    public void display(){
        System.out.println("This is a Shape..");
    }
}
class Circle extends Shape{
    @Override
    public void calculateArea() {
        double r = 5;
        double area = 3.14*r*r;
        System.out.println(area);
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        c.calculateArea();
        c.display();
    }
}
