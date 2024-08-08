package Page14.Task1475;

import java.util.Stack;

public class FinalPricesWithASpecialDiscountInAShop {
    public static void main(String[] args) {

    }
    public int[] finalPrices(int[] prices) {
        Stack<Integer> stack = new Stack<>();

        for (int i = prices.length-1; i >= 0; i--){
            int keep = prices[i];

            if (stack.empty() || stack.peek() < keep){
                if (!stack.empty()){
                    keep -= stack.peek();
                }
                stack.push(keep);
            }
            else {
                for (int j = 0; j < stack.size(); j++){

                }
            }
        }

        return prices;
    }
}
