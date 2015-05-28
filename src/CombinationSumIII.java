import java.util.ArrayList;
import java.util.List;

/**
 * Created by iprocoder on 15-5-28.
 */
public class CombinationSumIII {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        dfs(res, cur, 0, k, n, 0);
        return res;
    }

    private void dfs(List<List<Integer>> res, List<Integer> cur, int i, int k, int n, int sum) {
        if (cur.size() == k && sum == n) {
            res.add(new ArrayList<>(cur));
            return;
        }
        if (sum > n || cur.size() > k)
            return;


        for (int j = i + 1; j <= 9; j++) {
            cur.add(j);
            dfs(res, cur, j, k, n, sum + j);
            cur.remove(cur.size() - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(new CombinationSumIII().combinationSum3(9, 45));
    }
}
