package Page9.Task0938;

public class RangeSumOfBST {
    public static void main(String[] args) {
        TreeNode leftL = new TreeNode(3);
        TreeNode leftR = new TreeNode(7);
        TreeNode rightR = new TreeNode(18);

        TreeNode left = new TreeNode(5, leftL, leftR);
        TreeNode right = new TreeNode(15, rightR, null);

        TreeNode main = new TreeNode(10, left, right);
        System.out.println(new RangeSumOfBST().rangeSumBST(main, 7, 15));
    }
    public int rangeSumBST(TreeNode root, int low, int high) {
        int result = 0;
        if (root == null){
            return result;
        }
        int val = root.val;
        if (val >= low && val <= high){
            result+= val;
            if (val == low){
                result+= rangeSumBST(root.right, low, high);
            }
            else if (val == high){
                result+= rangeSumBST(root.left, low, high);
            }
            else {
                result+= rangeSumBST(root.right, low, high);
                result+= rangeSumBST(root.left, low, high);
            }
        }
        else if (root.val < low){
            result+= rangeSumBST(root.right, low, high);
        }
        else {
            result+= rangeSumBST(root.left, low, high);
        }
        return result;
    }
}

