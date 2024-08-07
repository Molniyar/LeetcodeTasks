package Page06.Task0617;

public class MergeTwoBinaryTrees {
    public static void main(String[] args) {

    }
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null){
            if (root2 ==null){
                return null;
            }
            return root2;
        }
        if (root2 == null){
            return root1;
        }

        root1.right = mergeTrees(root1.right,root2.right);
        root1.left = mergeTrees(root1.left,root2.left);
        root1.val += root2.val;

        return root1;
    }

}
