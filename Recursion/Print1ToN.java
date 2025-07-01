package Recursion;

import java.util.Scanner;

public class Print1ToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int number = sc.nextInt();
        print(number);
        sc.close();
    }
    public static void print(int num){
        if(num==0){
            return;
        }
        print(num-1);
        System.out.print(num + " ");
    }


}
