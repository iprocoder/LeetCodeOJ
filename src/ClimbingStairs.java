/**
 * Created by iprocoder on 2015/5/8.
 */
public class ClimbingStairs {
    public int climbStairs(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        int[] nums = new int[n + 1];
        nums[0] = 0;
        nums[1] = 1;
        nums[2] = 2;
        for (int i = 3; i <= n; i++) {
            nums[i] = nums[i - 1] + nums[i - 2];
        }
        return nums[n];
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(new ClimbingStairs().climbStairs(i));
        }

    }
}
