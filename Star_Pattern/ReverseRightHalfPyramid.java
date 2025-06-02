package Star_Pattern;
import java.util.Scanner;
public class ReverseRightHalfPyramid {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int Number = sc.nextInt();
        for (int i = 0; i <Number; i++) {
            for (int j = Number-i; j >=1; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
