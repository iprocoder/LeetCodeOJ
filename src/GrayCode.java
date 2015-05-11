import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by iprocoder on 2015/5/11.
 */
public class GrayCode {
    public List<Integer> grayCode(int n) {
        List<Integer> code = new ArrayList<>();
        grayCode(code, n);
        return code;
    }

    static void grayCode(List<Integer> code, int n) {
        if (n == 0) {
            code.add(0);
            return;
        }
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        grayCode(list1, n - 1);
        for (int i : list1) {
            list2.add(i + (int)Math.pow(2, n - 1));
        }
        Collections.reverse(list2);
        code.addAll(list1);
        code.addAll(list2);
    }

    public static void main(String[] args) {
        System.out.println(new GrayCode().grayCode(2));
    }
}
