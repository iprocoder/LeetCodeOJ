/**
 * Created by iprocoder on 15-5-4.
 */
public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if ((p == null && q != null) || (p != null && q == null) || p.val != q.val)
            return false;
        if (p != null && q != null && p.val == q.val) {
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
        return true;
    }
}
