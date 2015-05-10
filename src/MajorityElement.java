/**
 * Created by iprocoder on 15-5-10.
 */
public class MajorityElement {
    public int majorityElement(int[] nums) {
        int count = 0;
        int major = nums[0];
        for (int i : nums) {
            if (count == 0) {
                major = i;
                count++;
            } else if (major == i) {
                count++;
            } else {
                count--;
            }
        }
        return major;
//        return majorityElement(nums, 0, nums.length - 1);
    }

//    Integer majorityElement(int[] nums, int i, int j) {
//        if (i == j) return nums[i];
//        if (i + 1 == j) return nums[i] == nums[j] ? nums[i] : null;
//        int mid = (i + j) / 2;
//        Integer left = majorityElement(nums, i, mid);
//        Integer right = majorityElement(nums, mid + 1, j);
//        if (left == null) {
//            return right;
//        } else if (right == null) {
//            return left;
//        }
//        return left == right ? left : right;
//    }

    public static void main(String[] args) {
        MajorityElement element = new MajorityElement();
//        assert element.majorityElement(null) == 0;
        System.out.println(element.majorityElement(new int[]{2}));
    }
}
