package Star_Pattern;
import java.util.Scanner;
public class ZeroOneTrianglePattern {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int Number = sc.nextInt();
        int k=1;
        for (int i = 1; i <=Number; i++) {
            for (int j = 1; j <=i; j++) {
                if(k%2==0)
                    System.out.print("0 ");
                else
                    System.out.print("1 ");
                k++;
            }
            System.out.println();
        }
        sc.close();
    }
}