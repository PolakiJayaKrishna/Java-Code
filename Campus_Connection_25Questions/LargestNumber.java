//Create a Java program to find the largest of two numbers using if-else.
import java.util.Scanner;
public class LargestNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Numbers:");
        int A = sc.nextInt();
        int B = sc.nextInt();
        if(A<B) System.out.println(A +" is Lowest Number and "+B +" is Largest Number");
        else if(A>B) System.out.println(A +" A is Largest Number and "+B + "is Lowest Number");
        else System.out.println(A + " " + B + "Equals Numbers....");
    }
}