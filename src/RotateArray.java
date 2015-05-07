import java.util.Arrays;

/**
 * Created by iprocoder on 2015/5/7.
 */
public class RotateArray {
    public void rotate(int[] nums, int k) {
        System.out.println(Arrays.toString(nums));
        k %= nums.length;
        int[] tmp = new int[nums.length];
        int offset = nums.length - k;
        for (int i = 0; i < nums.length; i++) {
            tmp[i] = nums[(i + offset) % nums.length];
        }

        System.arraycopy(tmp, 0, nums, 0, nums.length);
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        RotateArray rotateArray = new RotateArray();
        int[] nums = {1, 2};
        rotateArray.rotate(nums, 1);
    }
}
