package Star_Pattern;

import java.util.Scanner;

public class ReverseLeftHalfPyramidPattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int Number = sc.nextInt();
        for (int i = 0; i < Number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (int k = Number - i; k >= 1; k--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
