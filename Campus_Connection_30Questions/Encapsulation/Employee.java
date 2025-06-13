//7. Create an Employee class with private fields and methods to calculate annual salary. Use proper accessors.
package Encapsulation;
public class Employee {
    private String name;
    private long salary;
    Employee(String name , long salary){
        this.salary = salary;
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public long getSalary(){
        return this.salary;
    }
    public long annualsalary(){
        return salary*12;
    }
    public void display(){
        System.out.println("Employee Name: " + getName());
        System.out.println("Salary of the Employee is: " + salary);
        System.out.println("Annual Salary: "  + annualsalary());
    }
    public static void main(String[] args) {
        Employee employee = new Employee("JayaKrishna", 52000);
        employee.display();
    }
}