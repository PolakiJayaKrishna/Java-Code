package Star_Pattern;
public class Rectangle {
    public static void main(String[] args) {
        int n = 5;
        int m = 10; // Size of the rectangle
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
