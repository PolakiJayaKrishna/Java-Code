package Star_Pattern;

import java.util.Scanner;

public class HollowSquarePattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int Number = sc.nextInt();
        for (int i = 1; i <= Number; i++) {
            for (int j = 1; j <= Number; j++) {
                if (i == 1 || j == 1 || i == Number || j == Number)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        sc.close();
    }
}
