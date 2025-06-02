package Star_Pattern;

import java.util.Scanner;

class SquarePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int Number = sc.nextInt();
        for (int i = 1; i <= Number; i++) {
            for (int j = 1; j <= Number; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}