/**
 * Created by iprocoder on 15-5-4.
 */
public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // 空树相等
        if (p == null && q == null)
            return true;

        // 只有一个子树为空树或者节点的值不相等时，则两颗树不相等
        if ((p == null && q != null) || (p != null && q == null) || (p.val != q.val))
            return false;

        // 判断子树是否相等
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);

    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        t1.left = new TreeNode(2);
        TreeNode t2 = new TreeNode(1);
        t2.left = new TreeNode(2);
        System.out.println(new SameTree().isSameTree(t1, t2));
    }
}
