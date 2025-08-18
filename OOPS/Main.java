class Employee {
    private String name;
    private int salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void work(){
        System.out.println("Employee is working");
    }
}

class Developer extends Employee {

    String language;

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    @Override
    public void work(){
        System.out.println("Developer codes in Java");
    }
}

abstract class Department{
    public abstract void deptName();
}

class ITDepartment extends Department{
    @Override
    public void deptName() {
        System.out.println("IT Department");
    }
}

public class Main{
    public static void main(String[]args){
        Department d = new ITDepartment();
        d.deptName();
    }
}