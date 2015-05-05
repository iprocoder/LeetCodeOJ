/**
 * Created by iprocoder on 15-5-5.
 */
public class PopulatingNextRightPointersinEachNode {
    public void connect(TreeLinkNode root) {
        if (root == null) {
            return;
        }

        if (root.left != null) {
            root.left.next = root.right;
            if (root.next != null) {
                root.right.next = root.next.left;
            }
        }

        connect(root.left);
        connect(root.right);
    }

    public static void main(String[] args) {
        System.out.println();
    }
}
