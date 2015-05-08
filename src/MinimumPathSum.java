/**
 * Created by iprocoder on 2015/5/8.
 */
public class MinimumPathSum {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] sum = new int[m][n];
        sum[0][0] = grid[0][0];
        for (int i = 1; i < m; i++) {
            sum[i][0] = grid[i][0] + sum[i - 1][0];
        }
        for (int i = 1; i < n; i++) {
            sum[0][i] = grid[0][i] + sum[0][i - 1];
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                sum[i][j] = Math.min(sum[i - 1][j], sum[i][j - 1]) + grid[i][j];
            }
        }
        return sum[m - 1][n - 1];
    }

    public static void main(String[] args) {
        int[][] grid = {{1, 2}, {1, 1}};
        System.out.println(new MinimumPathSum().minPathSum(grid));
    }
}
