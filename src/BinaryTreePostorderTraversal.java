import java.util.ArrayList;
import java.util.List;

/**
 * Created by iprocoder on 2015/5/9.
 */
public class BinaryTreePostorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        postorderTraversal(root, list);
        return list;
    }

    void postorderTraversal(TreeNode root, List<Integer> list) {
        if (root == null) return;
        postorderTraversal(root.left, list);
        postorderTraversal(root.right, list);
        list.add(root.val);
    }
}
