package Star_Pattern;

import java.util.Scanner;

public class NumberIncreasingPyramid {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int Number = sc.nextInt();
        for (int i = 1; i <= Number; i++) {
            for (int j = Number - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
