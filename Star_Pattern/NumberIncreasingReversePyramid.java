package Star_Pattern;
import java.util.Scanner;
public class NumberIncreasingReversePyramid {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int Number = sc.nextInt();
        for (int i = 1; i <=Number; i++) {
            for (int j = 2; j <=i; j++) {
                System.out.print(" ");
            }
            for (int k = Number-i+1; k >=1; k--) {
                System.out.print(k +" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
