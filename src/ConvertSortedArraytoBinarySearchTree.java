/**
 * Created by iprocoder on 2015/5/11.
 */
public class ConvertSortedArraytoBinarySearchTree {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) return null;
        return sortedArrayToBST(nums, 0, nums.length - 1);
    }

    TreeNode sortedArrayToBST(int[] nums, int low, int high) {
        int mid = (low + high) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        if (low < mid) root.left = sortedArrayToBST(nums, low, mid - 1);
        if (mid < high) root.right = sortedArrayToBST(nums, mid + 1, high);
        return root;
    }
}
