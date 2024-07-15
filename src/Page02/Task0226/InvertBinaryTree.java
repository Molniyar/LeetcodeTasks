package Page02.Task0226;

public class InvertBinaryTree {
    public static void main(String[] args) {

    }
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        TreeNode keep = invertTree(root.left);
        root.left = invertTree(root.right);
        root.right = keep;

        return root;
    }
}
