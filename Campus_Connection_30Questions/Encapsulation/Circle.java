//5. Create a Circle class with a private radius field. Use getters/setters to access it and compute area.

package Encapsulation;

public class Circle {
    private float radius;

    public void setradius(float radius) {
        this.radius = radius;
    }

    public float getradius() {
        return radius;
    }

    void display() {
        System.out.println("Radius is: " + getradius());
        System.out.printf("Compute Area is: %.2f%n", + Math.PI * radius * radius);
    }
    
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setradius(5f);
        circle.display();
    }
}
