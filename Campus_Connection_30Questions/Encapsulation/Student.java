//Create a Student class with private id, name, and public methods to display and set details.

package Encapsulation;

public class Student {
    private String id;
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void setid(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getid() {
        return id;
    }

    void display() {
        System.out.println("Student Details: ");
        System.out.println("Name: " + getName());
        System.out.println("id: " + getid());
    }
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("JayaKrishna Polaki");
        student.setid("99220040690");
        student.display();
    }
}
