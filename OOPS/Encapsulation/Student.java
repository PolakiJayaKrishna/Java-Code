package OOPS.Encapsulation;

class Student {

    private String name;
    private long reg_no;
    private String department;

    public void setName(String name) {
        this.name = name;
    }

    public void getName() {
        System.out.println(name);
    }

    public void setreg_no(long reg_no) {
        this.reg_no = reg_no;
    }

    public void getreg_no() {
        System.out.println(reg_no);
    }

    public void setdepartment(String department) {
        this.department = department;
    }

    public void getdepartment() {
        System.out.println(department);
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Register Number: " + reg_no);
        System.out.println("Department: " + department);
    }

    public static void main(String[] args) {
        Student obj = new Student();
        obj.setName("Jayakrishna");
        obj.setreg_no(99220040690L);
        obj.setdepartment("CSE");
        obj.display();
        System.out.println("------------------");
    }

    public static String getTotalPresent() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getTotalPresent'");
    }
}