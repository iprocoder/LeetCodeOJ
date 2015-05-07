/**
 * Created by iprocoder on 2015/5/7.
 */
public class ReverseInteger {
    public int reverse(int x) {
        int res = 0;

        while (x != 0) {
            if (res * 10 / 10 != res) return 0;

            res *= 10;
            int i = x % 10;
            res += i;
            x /= 10;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new ReverseInteger().reverse(-13));
    }
}
