import java.util.ArrayList;
import java.util.List;

/**
 * Created by iprocoder on 15-5-29.
 */
public class PalindromePartitioning {
    public static void main(String[] args) {

        System.out.println((new PalindromePartitioning().partition("aab")));
    }
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        List<String> cur = new ArrayList<>();
        dfs(res, cur, s);
        return res;
    }

    private boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--)) return false;
        }
        return true;
    }

    private void dfs(List<List<String>> res, List<String> cur, String str) {
        if (str.length() == 0) {
            res.add(new ArrayList<>(cur));
        }
        for (int i = 1; i <= str.length(); i++) {
            String sub = str.substring(0, i);
            if (isPalindrome(sub)) {
                cur.add(sub);
                String rest = str.substring(i);
                dfs(res, cur, rest);
                cur.remove(cur.size() - 1);
            }
        }
    }
}
