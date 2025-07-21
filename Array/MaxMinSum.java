
import java.util.Scanner;

public class MaxMinSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        int[][] arr = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
                if (min > arr[i][j]) {
                    min = arr[i][j];
                }
                sum = sum + arr[i][j];
            }
        }
        System.out.println("Maximum Number is: " + max);
        System.out.println("Minimum Number is: " + min);
        System.out.println("Sum of the Numbers in the Matrix is: " + sum);
        sc.close();
    }
}
// 2 5
// -50 20 3 25 -20
// 88 17 38 72 -10