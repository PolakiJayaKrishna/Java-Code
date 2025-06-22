// Transpose a square matrix (i.e., rows become columns and vice versa).
package Array;

public class TransposeMatrixPrint {

    public static void main(String[] args) {
        int[][] arr = { { 1, 0, 3 }, { 2, 0, 3 } };
        int rows = arr.length;
        int column = arr[0].length;
        int[][] transpose = new int[column][rows];
        System.out.println("Before the Transpose...");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < column; j++) {
                transpose[j][i] = arr[i][j];
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("After the Transpose...");
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}
