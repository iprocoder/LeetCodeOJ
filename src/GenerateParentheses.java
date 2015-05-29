import java.util.ArrayList;
import java.util.List;

/**
 * Created by iprocoder on 15-5-29.
 */
public class GenerateParentheses {
    public List<String> generateParenthesis(int n) {

        List<String> res = new ArrayList<>();
        String cur = new String();
        generate(res, cur, n, 0, 0);
        return res;
    }

    private void generate(List<String> res, String cur, int n, int left, int right) {
        if (left > n || right > n || right > left)
            return;

        if (left == right && left == n) {
            res.add(cur);
            return;
        }

        generate(res, cur + '(', n, left + 1, right);
        generate(res, cur + ')', n, left, right + 1);
    }

    public static void main(String[] args) {
        System.out.println(new GenerateParentheses().generateParenthesis(3));
    }
}
