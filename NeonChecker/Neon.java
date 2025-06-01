package NeonChecker;
import java.util.Scanner;
public class Neon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int N = sc.nextInt();
        int Sum=0,Product=1,Temp=0;
        while (N !=0) {
            Temp = N%10;
            Sum = Sum+Temp;
            Product = Product*Temp;
            N=N/10;
        }
        if(Sum == Product) {
            System.out.println("Neon Number");
        } else {
            System.out.println("Not a Neon Number");
        }sc.close();
    }
}
