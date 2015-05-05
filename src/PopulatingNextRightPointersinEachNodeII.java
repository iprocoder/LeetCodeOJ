/**
 * Created by iprocoder on 15-5-5.
 */
public class PopulatingNextRightPointersinEachNodeII {
    public void connect(TreeLinkNode root) {
        if (root == null) {
            return;
        }
        if (root.left != null && root.right != null) {
            root.left.next = root.right;
        }
        if (root.left != null && root.right == null) {
            root.left.next = nextChild(root.next);
        }
        if (root.right != null) {
            root.right.next = nextChild(root.next);
        }
        connect(root.right);
        connect(root.left);
    }

    TreeLinkNode nextChild(TreeLinkNode node) {
        while (node != null) {
            if (node.left != null) return node.left;
            if (node.right != null) return node.right;
            node = node.next;
        }
        return null;
    }

    public static void main(String[] args) {
        TreeLinkNode t1 = new TreeLinkNode(1);
        TreeLinkNode t2 = new TreeLinkNode(2);
    }
}
