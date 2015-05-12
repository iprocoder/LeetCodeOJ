import java.util.HashSet;
import java.util.Set;

/**
 * Created by iprocoder on 2015/5/12.
 */
public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        Set<Character> h = new HashSet<>();
        Set<Character> v = new HashSet<>();
        for (int i = 0; i < board.length; i++) {
            h.clear();
            v.clear();
            for (int j = 0; j < board[0].length; j++) {
                char c = board[i][j];
                if (c == '.')
                    continue;
                if (h.contains(c))
                    return false;
                h.add(c);
            }
            for (int j = 0; j < board[0].length; j++) {
                char c = board[j][i];
                if (c == '.')
                    continue;
                if (v.contains(c))
                    return false;
                v.add(c);
            }
        }
        Set<Character> t = new HashSet<>();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                t.clear();
                for (int k = i * 3; k < i * 3 + 3; k++) {
                    for (int l = j * 3; l < j * 3 + 3; l++) {
                        char c = board[k][l];
                        if (c == '.')
                            continue;
                        if (t.contains(c))
                            return false;
                        t.add(c);
                    }
                }
            }
        }
        return true;
    }

}
