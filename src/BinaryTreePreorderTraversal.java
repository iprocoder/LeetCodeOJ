import java.util.ArrayList;
import java.util.List;

/**
 * Created by iprocoder on 15-5-4.
 */
public class BinaryTreePreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();

        dfs(list, root);

        return list;
    }

    void dfs(List<Integer> list, TreeNode root) {
        if (root == null) {
            return;
        }

        list.add(root.val);
        dfs(list, root.left);
        dfs(list, root.right);
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        t1.left = t2;
        TreeNode t3 = new TreeNode(3);
        t2.left = t3;
        System.out.println(new BinaryTreePreorderTraversal().preorderTraversal(t1));
    }
}
