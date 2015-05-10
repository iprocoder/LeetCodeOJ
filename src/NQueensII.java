/**
 * Created by iprocoder on 15-5-10.
 */
public class NQueensII {
    public int totalNQueens(int n) {
        boolean[][] board = new boolean[n][n];
        return nQueues(0, 0, board);
    }

    int nQueues(int row, int col, boolean board[][]) {
        int solution = 0;
        for (int j = col; j < board[row].length; j++) {
            if (!check(row, j, board)) continue;
            if (row == board.length - 1) return 1;
            board[row][j] = true;
            if (row + 1 < board.length) solution += nQueues(row + 1, 0, board);
            board[row][j] = false;
        }
        return solution;
    }

    static boolean check(int row, int col, boolean[][] board) {
        /*
         * 检查行
         */
        for (int i = 0; i < row; i++) {
            if (board[i][col]) return false;
        }

        /*
         * 检查左上角都右下角对角线
         */
        int i = row - 1;
        int j = col - 1;
        while (i >= 0 && j >= 0) {
            if (board[i--][j--]) return false;
        }

        /*
         * 检查右上角到左下角对角线
         */
        i = row - 1;
        j = col + 1;
        while (i >= 0 && j < board[i].length) {
            if (board[i--][j++]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        NQueensII nQueensII = new NQueensII();
        assert nQueensII.totalNQueens(0) == 0;
        assert nQueensII.totalNQueens(1) == 1;
        assert nQueensII.totalNQueens(2) == 2;
        System.out.println(nQueensII.totalNQueens(8));
    }
}
