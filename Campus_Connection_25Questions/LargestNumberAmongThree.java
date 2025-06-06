import java.util.Scanner;

public class LargestNumberAmongThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a == b && b == c) {
            System.out.println("a,b,c Numbers are same...");
        } else {
            if (a > b && a > c) {
                System.out.print(a + " Bigger...value !");
            } else if (b > a && b > c) {

                System.out.print(b + " Bigger...value !");

            } else if (c > a && c > b) {
                System.out.print(c + " Bigger...value !");

            }
        }
        sc.close();
    }
}
