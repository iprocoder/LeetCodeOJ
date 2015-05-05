/**
 * Created by iprocoder on 15-5-5.
 */
public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length;
        int mid;

        while (low < high) {
            mid = (low + high) / 2;

            if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return high;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        System.out.println(new SearchInsertPosition().searchInsert(nums, 1));
    }
}
