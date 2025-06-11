package OOPS.Encapsulation;
class StudentAttendance {
    private String name;
    private String rollno;
    private static int totalPresent = 0; // Shared for all students

    // Constructor
    StudentAttendance(String studentName , String studentRollNo){
        this.name = studentName;
        this.rollno = studentRollNo;
    }

    // Static method to increase present count
    public static void markPresent() {
        totalPresent++;
    }

    // Getter methods
    public String getName(){
        return name;
    }

    public String getRollno() {
        return rollno;
    }

    // Static method to get shared present count
    public static int getTotalPresent() {
        return totalPresent;
    }

    // Main method
    public static void main(String[] args) {
        StudentAttendance s1 = new StudentAttendance("JayaKrishna", "99220040690");
        StudentAttendance.markPresent(); // Mark s1 present

        StudentAttendance s2 = new StudentAttendance("ManojCharan", "99220040681");
        StudentAttendance.markPresent(); // Mark s2 present

        System.out.println(s1.getName() + " (" + s1.getRollno() + ")");
        System.out.println(s2.getName() + " (" + s2.getRollno() + ")");
        
        // Display shared present count
        System.out.println("Total Present Today: " + StudentAttendance.getTotalPresent());
    }
}
