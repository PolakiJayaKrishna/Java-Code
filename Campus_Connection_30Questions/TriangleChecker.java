import java.util.Scanner;
public class TriangleChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Triangle one side angle: ");
        int first = sc.nextInt();
        System.out.print("Enter Triangle second side angle: ");
        int second = sc.nextInt();
        System.out.print("Enter Triangle thrid side angle: ");
        int third = sc.nextInt();
        int sum=first+second+third;
        if(sum == 180)
            System.out.print("valid Triangle...");
        else 
            System.out.print("Invalid Triangle!");
        sc.close();
    }
}
