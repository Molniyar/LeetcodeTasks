package Page01.Task0101;

public class SymmetricTree {
    public static void main(String[] args) {

    }
    public boolean isSymmetric(TreeNode root) {
        return isMirrored(root.left,root.right);
    }

    public boolean isMirrored(TreeNode left, TreeNode right) {
        if (left == null && right == null) {return true;}
        if (left == null || right == null) {return false;}

        return (left.val == right.val) && isMirrored(left.left, right.right) && isMirrored(left.right, right.left);
    }
}
