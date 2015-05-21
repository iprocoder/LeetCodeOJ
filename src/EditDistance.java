/**
 * Created by iprocoder on 15-5-21.
 */
public class EditDistance {
    public int minDistance(String word1, String word2) {
        int m = word1.length(), n = word2.length();
        int[][] dis = new int[m + 1][n + 1];
        for (int i = 0; i <= n; i++) {
            dis[0][i] = i;
        }
        for (int i = 0; i <= m; i++) {
            dis[i][0] = i;
        }
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                int c = word1.charAt(i - 1) == word2.charAt(j - 1) ? 0 : 1;
                dis[i][j] = Math.min(Math.min(dis[i - 1][j], dis[i][j - 1]) + 1, dis[i - 1][j - 1] + c);
            }
        }
        return dis[m][n];
    }

    public int minDistance1(String word1, String word2) {
        int m = word1.length(), n = word2.length();
        int[][] dis = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                dis[i][j] = Integer.MAX_VALUE;
            }
        }
        dis[0][0] = 0;
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i > 0) dis[i][j] = Math.min(dis[i][j], dis[i - 1][j] + 1);
                if (j > 0) dis[i][j] = Math.min(dis[i][j], dis[i][j - 1] + 1);
                if (i > 0 && j > 0) {
                    int c = word1.charAt(i - 1) == word2.charAt(j - 1) ? 0 : 1;
                    dis[i][j] = Math.min(dis[i][j], dis[i - 1][j - 1] + c);
                }

            }
        }
        return dis[m][n];
    }
    public static void main(String[] args) {
        System.out.println(new EditDistance().minDistance("c", "abc"));
    }
}
