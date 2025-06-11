package OOPS.Encapsulation;
class StudentAttendance {
    private String name;
    private String rollno;
    private static int totalPresent = 0; 


    StudentAttendance(String studentName , String studentRollNo){
        this.name = studentName;
        this.rollno = studentRollNo;
    }

    public static void markPresent() {
        totalPresent++;
    }


    public String getName(){
        return name;
    }

    public String getRollno() {
        return rollno;
    }


    public static int getTotalPresent() {
        return totalPresent;
    }


    public static void main(String[] args) {
        StudentAttendance s1 = new StudentAttendance("JayaKrishna", "99220040690");
        StudentAttendance.markPresent(); 

        StudentAttendance s2 = new StudentAttendance("ManojCharan", "99220040681");
        StudentAttendance.markPresent(); 

        System.out.println(s1.getName() + " (" + s1.getRollno() + ")");
        System.out.println(s2.getName() + " (" + s2.getRollno() + ")");
        
  
        System.out.println("Total Present Today: " + StudentAttendance.getTotalPresent());
    }
}
