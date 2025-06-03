package Star_Pattern;
import java.util.Scanner;
public class HollowPyramidPattern {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int Number = sc.nextInt();
        for (int i = 1; i <=Number; i++) {
            for (int j = Number-i; j >=1; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <=2*i-1 ; j++) {
                if(j==1 || j== 2*i-1||  i==Number)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        sc.close();
    }
}
