import java.util.Scanner;

public class AdmissionEligibility {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks of");
        System.out.print("Maths: ");
        int maths = sc.nextInt();
        System.out.print("Physics: ");
        int physics = sc.nextInt();
        if ((maths >= 0 && maths <= 100) && (physics >= 0 && physics <= 100)) {
            if (maths > 50 && physics > 60)
                System.out.println("Eligible for admission...!");
            else
                System.out.println("Not Eligible for admission...!" +"\n" + "For Admission in both subjects strictly greater than 50 in Maths and strictly greater than 60 in Physics");
        }
        else 
            System.out.println("Enter Valid Marks !");

        sc.close();
    }

}
