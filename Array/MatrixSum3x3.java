public class MatrixSum3x3 {
    // Print the sum of all elements in a 3x3 matrix.
    public static void main(String[] args) {
        int[][] arr = { { 1, 0, 2 }, { 2, 0, 10 }, { 3, 0, -10 } };
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println(sum);
    }
}
