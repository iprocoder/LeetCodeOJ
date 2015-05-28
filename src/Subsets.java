import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by iprocoder on 15-5-28.
 */
public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        Arrays.sort(nums);
        subsets(nums, res, cur, 0);
        return res;
    }

    private void subsets(int[] nums, List<List<Integer>> res, List<Integer> cur, int i) {
        res.add(new ArrayList<>(cur));

        for (int j = i; j < nums.length; j++) {
            cur.add(nums[j]);
            subsets(nums, res, cur, j + 1);
            cur.remove(cur.size() - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(new Subsets().subsets(new int[]{1, 5, 3}));
    }
}
