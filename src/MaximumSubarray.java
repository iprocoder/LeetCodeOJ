/**
 * Created by iprocoder on 2015/5/7.
 */
public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        return maxSubArray(nums, 0, nums.length - 1);
    }

    int maxSubArray(int[] nums, int low, int high) {
        if (low == high) {
            return nums[low];
        }

        int mid = (low + high) / 2;

        int leftBorderSum = 0;
        int rightBorderSum = 0;
        int maxLeftBorderSum = Integer.MIN_VALUE;
        int maxRightBorderSum = Integer.MIN_VALUE;
        int maxLeftSum = maxSubArray(nums, low, mid);
        int maxRightSum = maxSubArray(nums, mid + 1, high);
        for (int i = mid; i >= low; i--) {
            leftBorderSum += nums[i];
            if (leftBorderSum > maxLeftBorderSum) {
                maxLeftBorderSum = leftBorderSum;
            }
        }
        for (int i = mid + 1; i <= high; i++) {
            rightBorderSum += nums[i];
            if (rightBorderSum > maxRightBorderSum) {
                maxRightBorderSum = rightBorderSum;
            }
        }
        return Math.max(Math.max(maxLeftSum, maxRightSum), maxLeftBorderSum + maxRightBorderSum);
    }

    public static void main(String[] args) {
        int[] nums = {-2, -1};
        System.out.println(new MaximumSubarray().maxSubArray(nums));
    }
}
