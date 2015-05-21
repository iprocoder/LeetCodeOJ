/**
 * Created by iprocoder on 15-5-20.
 */
public class UniquePathsII {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {


        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] path = new int[m][n];
        if (obstacleGrid[0][0] == 1)
            path[0][0] = 0;
        else
            path[0][0] = 1;
        for (int i = 1; i < m; i++) {
            if (obstacleGrid[i][0] != 1) {
                path[i][0] = path[i - 1][0];
            }
        }
        for (int i = 1; i < n; i++) {
            if (obstacleGrid[0][i] != 1) {
                path[0][i] = path[0][i - 1];
            }
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (obstacleGrid[i][j] == 1) {
                    path[i][j] = 0;
                } else {
                    path[i][j] = path[i - 1][j] + path[i][j - 1];
                }
            }
        }
        return path[m - 1][n - 1];
    }

    public static void main(String[] args) {
        //System.out.println(new UniquePathsII().uniquePathsWithObstacles(new int[][]{{0, 0, 0}, {0, 1, 0}, {0, 0, 0}}));
        System.out.println(new UniquePathsII().uniquePathsWithObstacles(new int[][]{{0, 0}}));
    }
}
