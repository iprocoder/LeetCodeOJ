import sun.plugin2.applet.Applet2MessageHandler;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * Created by iprocoder on 2015/5/6.
 */
public class HappyNumber {
    public boolean isHappy(int n) {
        Map<Integer, Integer> table = new HashMap<>();
        while (table.get(n) == null) {
            int sum = 0;
            int m = n;
            while (n != 0) {
                int a = n % 10;
                sum += a * a;
                n /= 10;
            }
            if (sum == 1) {
                return true;
            } else {
                table.put(m, sum);
                n = sum;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new HappyNumber().isHappy(2));
    }
}
