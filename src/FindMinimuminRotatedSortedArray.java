/**
 * Created by iprocoder on 2015/5/11.
 */
public class FindMinimuminRotatedSortedArray {
    public int findMin(int[] nums) {
        return findMin(nums, 0, nums.length - 1);
    }

    public int findMin(int[] nums, int low, int high) {
        if (low == high) return nums[low];
        int mid = (low + high) / 2;
        if (nums[mid] > nums[high]) return findMin(nums, mid + 1, high);
        return findMin(nums, low, mid);
    }

    public static void main(String[] args) {
        System.out.println(new FindMinimuminRotatedSortedArray().findMin(new int[]{0, 1, 2}));
    }
}
