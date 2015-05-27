import java.util.HashSet;
import java.util.Set;

/**
 * Created by iprocoder on 15-5-27.
 */
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int x : nums) {
            if (set.contains(x)) {
                return true;
            }
            set.add(x);
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new ContainsDuplicate().containsDuplicate(new int[]{1, 2, 3, 4, 1}));
    }
}
