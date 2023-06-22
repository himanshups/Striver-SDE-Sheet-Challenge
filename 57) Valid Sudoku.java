public class Solution {
    private static boolean isValid(int[][] board, int row, int col, int c) {
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == c)
                return false;
            if (board[row][i] == c)
                return false;
            if (board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] != 0
                    && board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == c)
                return false;
        }
        return true;
    }
    public static boolean sudoku(int[][] board) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board.length; col++) {
                if (board[row][col] == 0) {
                    for (char c = 1; c <= 9; c++) {
                        if (isValid(board, row, col, c)) {
                            board[row][col] = c;
                            if (sudoku(board)) {
                                return true;
                            } else {
                                board[row][col] = 0;
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
	public static boolean isItSudoku(int matrix[][]) {

		// Write your code here.
        return sudoku(matrix);
	}
}
