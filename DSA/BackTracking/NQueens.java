package DSA.BackTracking;

public class NQueens {
    public static void main(String[] args) {
        int n = 4;
        char[][] board = new char[n][n];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = 'x';
            }
        }
        recursion(board, 0);
    }

    public static void recursion(char[][] board, int row) {
        // BaseCase
        if (row == board.length) {
            printBoard(board);
            return;
        }
        // Recursion
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                recursion(board, row + 1);
                board[row][j] = 'x';
            }
        }
    }

    public static boolean isSafe(char[][] board, int row, int column) {

        // vertical up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][column] == 'Q')
                return false;
        }
        // left Diagonal up
        for (int i = row - 1, j = column - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q')
                return false;
        }
        // Right Diagonal up
        for (int i = row - 1, j = column + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q')
                return false;
        }
        return true;
    }

    public static void printBoard(char[][] board) {
        System.out.println("-------Chess Board---------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
