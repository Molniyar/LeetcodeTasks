package Page16.Task1614;

public class MaximumNestingDepthOfTheParentheses {
    public static void main(String[] args) {
        System.out.println(new MaximumNestingDepthOfTheParentheses().maxDepth("(1+(2*3)+((8)/4))+1"));
    }
    public int maxDepth(String s) {
        int result = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == '('){count++;}
            if (s.charAt(i) == ')'){result = Math.max(result,count);count--;}
        }
        return result;
    }
}
