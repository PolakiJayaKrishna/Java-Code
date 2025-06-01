//Write a program to check if a number is positive, negative, or zero using if-else.
import java.util.Scanner;
public class SignChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int Number = sc.nextInt();
        if(Number>0) System.out.println("Positive Number...");
        else if(Number<0) System.out.println("Negative Number...");
        else System.out.println("Zero...");sc.close();
    }
}