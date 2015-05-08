import java.util.ArrayList;
import java.util.List;

/**
 * Created by iprocoder on 2015/5/8.
 */
public class Triangle {
    public int minimumTotal(List<List<Integer>> triangle) {
        int[][] sum = new int[triangle.size()][triangle.size()];
        sum[0][0] = triangle.get(0).get(0);
        for (int i = 1; i < triangle.size(); i++) {
            sum[i][0] = sum[i - 1][0] + triangle.get(i).get(0);
            sum[i][i] = sum[i - 1][i - 1] + triangle.get(i).get(i);
        }
        for (int i = 2; i < triangle.size(); i++) {
            for (int j = 1; j < triangle.get(i).size() - 1; j++) {
                sum[i][j] = Math.min(sum[i - 1][j - 1], sum[i - 1][j]) + triangle.get(i).get(j);
            }
        }
        int min = sum[triangle.size() - 1][0];
        for (int i = 0; i < triangle.size(); i++) {
            if (sum[triangle.size() - 1][i] < min) {
                min = sum[triangle.size() - 1][i];
            }
        }
        return min;
    }
}
