/**
 * Created by iprocoder on 2015/5/12.
 */
public class AddBinary {
    public String addBinary(String a, String b) {
        StringBuilder res = new StringBuilder();
        int m = a.length() - 1;
        int n = b.length() - 1;
        int c = 0;
        while (m >= 0 || n >= 0 || c == 1) {
            c += m >= 0 ? a.charAt(m--) - '0' : 0;
            c += n >= 0 ? b.charAt(n--) - '0' : 0;
            res.append((char)(c % 2 + '0'));
            c /= 2;
        }
        return res.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(new AddBinary().addBinary("11", "1"));
    }
}
