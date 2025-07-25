package DSA.BackTracking;

public class CountNQueens {
    static int count = 0;
    public static void main(String[] args) {
        int n = 5;
        char[][] board = new char[n][n];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = 'x';
            }
        }
        recursion(board, 0);
        System.out.println("Totoal Number Of Posible Solutions are =  "  + count);
    }
    public static void recursion(char[][] board , int row){
        //base
        if(board.length == row){
            count++;
            return;
        }
        //recursion
        for (int j = 0; j < board.length; j++) {
            if(isSafe(board , row , j)){
                board[row][j] = 'Q';
                recursion(board, row+1);
                board[row][j] = 'x';
            }
        }
    }
    public static boolean isSafe(char[][] board , int row , int coloumn){
        //vertical
        for(int i = row-1;i>=0;i--){
            if(board[i][coloumn] == 'Q')    return false;
        }
        //Up Diagonal Left
        for(int i=row-1 , j = coloumn - 1; i>=0 && j>=0 ; i-- , j--){
            if(board[i][j] == 'Q')  return false;
        }
        //Up Diagonal right
        for(int i=row-1 , j=coloumn+1 ; i>=0 && j<board.length;i--,j++){
            if(board[i][j] == 'Q')  return false;
        }
        return true;
    }
}
