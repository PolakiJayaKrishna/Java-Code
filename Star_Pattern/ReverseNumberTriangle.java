package Star_Pattern;
import java.util.Scanner;
public class ReverseNumberTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int Number = sc.nextInt();
        for (int i = 0; i <Number; i++) {
            for (int j =1; j <=Number-i; j++) {
                System.out.print(j +" ");
            }
            System.out.println();
        }
        sc.close();
    }
}