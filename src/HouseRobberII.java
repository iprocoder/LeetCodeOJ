/**
 * Created by iprocoder on 15-5-22.
 */
public class HouseRobberII {
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;

        int length = nums.length;
        int[] first = new int[length];
        first[0] = nums[0];
        if (length == 1)
            return first[0];
        first[1] = Math.max(nums[0], nums[1]);
        if (nums.length == 2)
            return first[1];
        for (int i = 2; i < length - 1; i++) {
            first[i] = Math.max(first[i - 1], first[i - 2] + nums[i]);
        }

        int[] second = new int[length];
        second[0] = 0;
        second[1] = nums[1];
        for (int i = 2; i < length; i++) {
            second[i] = Math.max(second[i - 1], second[i - 2] + nums[i]);
        }

        return Math.max(first[length - 2], second[length - 1]);
    }

    public static void main(String[] args) {
        System.out.println(new HouseRobberII().rob(new int[]{2, 3, 4, 1}));
    }
}
