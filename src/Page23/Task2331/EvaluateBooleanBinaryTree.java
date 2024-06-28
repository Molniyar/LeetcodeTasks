package Page23.Task2331;

public class EvaluateBooleanBinaryTree {
    public static void main(String[] args) {

    }
    public boolean evaluateTree(TreeNode root) {
        switch (root.val){
            case 0 -> {return false;}
            case 1 -> {return true;}
            case 2 -> {return evaluateTree(root.left) || evaluateTree(root.right);}
            default -> {return evaluateTree(root.left) && evaluateTree(root.right);}
        }
    }
}
