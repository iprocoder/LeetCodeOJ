/**
 * Created by iprocoder on 2015/5/8.
 */
public class UniqueBinarySearchTrees {
    public int numTrees(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        int[] nums = new int[n + 1];
        nums[0] = 1;
        nums[1] = 1;
        nums[2] = 2;
        for (int i = 3; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                nums[i] += nums[j] * nums[i - j - 1];
            }
        }
        return nums[n];
    }


    public static void main(String[] args) {
        System.out.println(new UniqueBinarySearchTrees().numTrees(1));
    }
}
