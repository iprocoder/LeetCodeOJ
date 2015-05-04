/**
 * Created by iprocoder on 15-5-4.
 */
public class ExcelSheetColumnNumber {
    public int titleToNumber(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += (s.charAt(s.length() - i - 1) - 'A' + 1) * (int)Math.pow(26, i);
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(new ExcelSheetColumnNumber().titleToNumber("AA"));
    }
}
