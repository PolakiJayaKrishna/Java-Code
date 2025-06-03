package Star_Pattern;

import java.util.Scanner;

public class HollowReversePyramid {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int Number = sc.nextInt();
        for (int i = 1; i <= Number; i++) {
            for (int j = 2; j <= i; j++) {
                System.out.print("  ");
            }
            for (int j = 2 * (Number - i + 1) - 1; j >= 1; j--) {
                if (j == 2 * (Number - i + 1) - 1 || j == 1 || i == 1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        sc.close();
    }
}
