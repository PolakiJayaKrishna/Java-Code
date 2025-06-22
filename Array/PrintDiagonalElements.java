package Array;

//Given a 2D matrix, print only the diagonal elements.
public class PrintDiagonalElements {
    public static void main(String[] args) {
        int[][] arr = { { 1, 0 }, { 2, 0 } };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j)
                    System.out.println(arr[i][j]);
            }
        }
    }
}
