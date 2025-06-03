package Star_Pattern;
import java.util.Scanner;

class Jk{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int Number = sc.nextInt();
        int k=1;
        for (int i = 1; i <=Number; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(k + " ");
                k++;
            }
            System.out.println();
        }
        sc.close();
    }
}