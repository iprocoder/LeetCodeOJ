import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by iprocoder on 15-5-29.
 */
public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        Integer[] num = new Integer[nums.length];
        for (int i = 0; i < nums.length; i++) {
            num[i] = nums[i];
        }
        dfs(res, num, 0);
        return res;
    }

    private void dfs(List<List<Integer>> res, Integer[] nums, int i) {
        if (i == nums.length) {
            res.add(new ArrayList<>(Arrays.asList(nums)));
        }


        for (int j = i; j < nums.length; j++) {
            swap(nums, i, j);
            dfs(res, nums, i + 1);
            swap(nums, j, i);
        }
    }

    private <T> void swap(T[] nums, int i, int j) {
        T temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        System.out.println(new Permutations().permute(new int[]{1, 2, 3, 4}));
    }
}
