import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by iprocoder on 15-5-29.
 */
public class SubsetsII {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        Arrays.sort(nums);
        dfs(res, cur, 0, nums);
        return res;
    }

    private void dfs(List<List<Integer>> res, List<Integer> cur, int i, int[] nums) {
        res.add(new ArrayList<>(cur));

        for (int j = i; j < nums.length; j++) {
            if (j > i && nums[j] == nums[j - 1])
                continue;

            cur.add(nums[j]);
            dfs(res, cur, j + 1, nums);
            cur.remove(cur.size() - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(new SubsetsII().subsetsWithDup(new int[]{1, 2, 3}));
    }
}
