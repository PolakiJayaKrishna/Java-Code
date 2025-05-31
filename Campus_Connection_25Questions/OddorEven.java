//Write a program to check if a number is even or odd using if-else
import java.util.Scanner;
public class OddorEven{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int Number = sc.nextInt();
        if(Number==0) System.out.println(Number +" is Zero...");
        else if(Number%2==0) System.out.print(Number+" is an Even Number...");
        else System.out.println(Number +" is an Odd Number...");
    }
}