package JaggedArray;

public class jagged {
    public static void main(String[] args) {
        int row = 5;
        int[][] arr = new int[row][];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new int[i + 1];
        }
        int count =0;
        for (int j = 0; j < arr.length; j++) {
            for (int k = 0; k < arr[j].length; k++) {
                arr[j][k] = count++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            for (int k = 0; k < arr[j].length; k++) {
                System.out.print(arr[j][k] + " ");
            }
            System.out.println();
        }
    }
}
