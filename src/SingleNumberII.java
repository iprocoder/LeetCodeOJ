/**
 * Created by iprocoder on 15-5-10.
 */
public class SingleNumberII {
    public int singleNumber(int[] nums) {
        int[] count = new int[32];
        for (int num : nums) {
            int i = 0;
            while (num != 0) {
                count[i++] += num & 1;
                num >>>= 1;
            }
        }
        int sum = 0;
        for (int i = 31; i >= 0; i--) {
            count[i] %= 3;
            sum <<= 1;
            sum |= count[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(new SingleNumberII().singleNumber(new int[]{1}));
    }
}
