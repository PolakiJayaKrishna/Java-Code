
public class SearchIn2DMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1,0,3},{2,0,3}};
        int num = 2;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if(arr[i][j] == num)
                    System.out.print("Row " + i + " & Column " + j);
            }
        }
    }
}
