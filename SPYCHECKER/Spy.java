package SPYCHECKER;

import java.util.Scanner;

public class Spy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int N = sc.nextInt();
        int copy = N, temp = 0, result = 0;
        N = N * N;
        while (N != 0) {
            temp = N % 10;
            result += temp;
            N = N / 10;
        }
        if (copy == result) {
            System.out.println(copy + " Spy Number");
        } else {
            System.out.println(copy + " Not a Spy Number");
        }
    }
}
