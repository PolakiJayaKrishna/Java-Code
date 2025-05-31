package Star_Pattern;

public class Square {
    public static void main(String[] args) {
        int n = 5; // Size of the square
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
