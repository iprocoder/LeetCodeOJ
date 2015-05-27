/**
 * Created by iprocoder on 15-5-27.
 */
public class WordSearch {

    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (dfs(board, word.toCharArray(), i, j, 0))
                    return true;
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, char[] word, int row, int col, int l) {
        if (l == word.length) return true;
        if (row < 0 || col < 0 ||
                row == board.length || col >= board[row].length) return false;
        if (board[row][col] == '\0') return false;

        char ret = board[row][col];
        board[row][col] = '\0';
        boolean flag = dfs(board, word, row + 1, col, l + 1) ||
                dfs(board, word, row - 1, col, l + 1) ||
                dfs(board, word, row, col + 1, l + 1) ||
                dfs(board, word, row, col - 1, l + 1);
        board[row][col] = ret;
        return flag;
    }

    private boolean exist(char[][] board, int row, int col, char[] word, int i) {
        if (i == word.length) return true;
        if (row<0 || col<0 || row >= board.length || col >= board[row].length) return false;
        if (board[row][col] != word[i]) return false;
        board[row][col] ^= 256;
        boolean exist = exist(board, row, col+1, word, i+1)
                || exist(board, row, col-1, word, i+1)
                || exist(board, row+1, col, word, i+1)
                || exist(board, row-1, col, word, i+1);
        board[row][col] ^= 256;
        return exist;
    }

    public static void main(String[] args) {
        System.out.println(new WordSearch().exist(
                new char[][]{"aaaa".toCharArray(), "aaaa".toCharArray(), "aaaa".toCharArray()},
                "aaaaaaaaaaaa"));
    }
}
