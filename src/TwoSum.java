import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by iprocoder on 15-5-17.
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target)
                    return new int[]{i + 1, j + 1};
            }
        }
        return null;
    }

    /* HashMap solution */
    public int[] twoSumHashMap(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int x = target - nums[i];
            if (map.containsKey(x)) {
                return new int[]{map.get(x) + 1, i + 1};
            }
            map.put(nums[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        int[] res = new TwoSum().twoSumHashMap(new int[]{2, 7, 11, 15}, 9);
        System.out.println(Arrays.toString(res));
    }
}
