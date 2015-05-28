import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * Created by iprocoder on 15-5-23.
 */
public class KthLargestElementinanArray {
    public int findKthLargest1(int[] nums, int k) {

        Arrays.sort(nums);
        return nums[nums.length - k];
    }

    public int findKthLargest2(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(k);
        for (int val : nums) {
            queue.offer(val);
            if (queue.size() > k) {
                queue.poll();
            }
        }
        return queue.peek();
    }

    public int findKthLargest(int[] nums, int k) {
        k = nums.length - k;
        int lo = 0;
        int hi = nums.length - 1;
        while (lo < hi) {
            int j = partition(nums, lo, hi);
            if (j < k) {
                lo = j + 1;
            } else if (j > k) {
                hi = j - 1;
            } else {
                break;
            }
        }
        return nums[k];
    }

    private int partition(int[] a, int lo, int hi) {
        int i = lo;
        int j = hi + 1;
        int v = a[lo];
        while (true) {
            while (i < hi && a[++i] < v);
            while (j > lo && a[--j] > v);
            if (i >= j) break;
            exch(a, i, j);
        }
        exch(a, lo, j);
        return j;
    }

    private void exch(int[] a, int i, int j) {
        final int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    public static void main(String[] args) {
        System.out.println(new KthLargestElementinanArray().findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 2));
    }
}
