import java.util.Scanner;
public class GradeMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Mark of an Subject: ");
        int marks = sc.nextInt();
        if(marks>=0 && marks<=100){
            if(marks>=90)
                System.out.println("S Grade....! Congrats");
            else if (marks>=80)
                System.out.println("A Grade...!");
            else if(marks >=70)
                System.out.println("B Grade...");
            else if (marks>=60)
                System.out.println("C Grade...!");
            else if(marks >=50)
                System.out.println("D Grade...");
            else if (marks>=40)
                System.out.println("E Grade...!");
            else if(marks < 40)
                System.out.println("F Grade...!" +"\n" + "Fail.Better Luck Next Time");
            }
        else {
            System.out.println("Enter Valid Marks..");
        }
        sc.close();
    }
}
