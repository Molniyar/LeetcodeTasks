package Page01.Task0108;

public class ConvertSortedArrayToBinarySearchTree {
    public static void main(String[] args) {

    }
    public TreeNode sortedArrayToBST(int[] nums) {
        int l = nums.length;

        if (l == 0) {return null;}                 // there's nothing to return, so return null
        if (l == 1) {return new TreeNode(nums[0]);}// there's only one number, so return it (in TreeNode of course)
        return build(nums,0,l-1);        // here it is required to build a TreeNode
    }
    private TreeNode build (int [] nums, int low, int high){
        if (low>high) return null;

        int mid =low+(high-low)/2;
        TreeNode node = new TreeNode(nums[mid]);

        node.left  = build(nums,low,mid-1);
        node.right = build(nums,mid+1,high);

        return node;
    }
}
