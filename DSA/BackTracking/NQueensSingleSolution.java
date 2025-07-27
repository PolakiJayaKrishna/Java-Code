package DSA.BackTracking;

public class NQueensSingleSolution {
    public static void main(String[] args) {
        int n = 4;
        char[][] board = new char[n][n];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = 'x';
            }
        }
        if (recursion(board, 0)) {
            System.out.println("Solution is possible: ");
            printArray(board);
        } else {
            System.out.println("Solution is not possible ");
        }
    }

    public static boolean recursion(char[][] board, int row) {
        // base
        if (board.length == row) {
            return true;
        }
        // Recurrsion
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                if (recursion(board, row + 1)) {
                    return true;
                }
                board[row][j] = 'x'; // backtracking
            }
        }
        return false;
    }

    public static boolean isSafe(char[][] board, int row, int column) {
        // vertical
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][column] == 'Q') {
                return false;
            }
        }
        // left up diagonal
        for (int i = row - 1, j = column - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        // right up diagonal
        for (int i = row - 1, j = column + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static void printArray(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}