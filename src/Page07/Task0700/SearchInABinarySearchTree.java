package Page07.Task0700;

public class SearchInABinarySearchTree {
    public static void main(String[] args) {

    }
    public TreeNode searchBST(TreeNode root, int val) {
        for (;;){
            if (root == null || root.val == val){
                return root;
            }

            if (root.val > val){
                root = root.left;
            }
            else {
                root = root.right;
            }
        }
    }
}
