//Create a program to check if a person is eligible to vote (age >= 18).
import java.util.Scanner;
class EligibleToVote{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Age: ");
        int Age = sc.nextInt();
        if(Age<=0) System.out.println("Kindly Enter Valid Age..!");
        else if(Age>=18) System.out.println("You are Eligible to Vote...");
        else System.out.println("You are not Eligible to Vote...");
        sc.close();
    }
}