import java.util.HashSet;
import java.util.Set;

/**
 * Created by iprocoder on 15-5-17.
 */
public class LongestSubstringWithoutRepeatingCharacters {
    /* brute force O(n^2) */
    public int lengthOfLongestSubstring1(String s) {
        char[] str = s.toCharArray();
        int max = 0;
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < str.length; i++) {
            int ans = 0;
            for (int j = i; j < str.length; j++) {
                if (set.contains(str[j])) {
                    max = ans > max ? ans : max;
                    break;
                }
                set.add(str[j]);
                ans++;
            }
            set.clear();
        }
        return max;
    }

    /*
     * 维护一个窗口
     * 正常情况下移动右窗口，如果没有出现重复则继续移动右窗口
     * 当出现重复字符时，移动左窗口并清楚该位置上的字符直到窗口中没有重复字符
     * 事件复杂度为 O(n)
     */
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int i = 0;
        Set<Character> set = new HashSet<>();
        for (int j = 0; j < s.length(); j++) {
            char c = s.charAt(j);
            while (set.contains(c)) {
                set.remove(s.charAt(i));
                i++;
            }
            set.add(c);
            max = Math.max(j - i + 1, max);
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("bbbbb"));
    }
}
