package Page01.Task0121;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {

    }
    public int maxProfit(int[] prices) {
        int x = prices[0];

        int profit = 0;

        for (int i = 1; i < prices.length; i++){//if "i" is equals to 0, "if (keep < x) {/x = keep;/continue;/}" is doing nothing
            int keep = prices[i];

            if (keep < x){
                x = keep;
                continue;
            }

            if ((keep - x) > profit){
                profit = keep - x;
            }
        }

        return profit;
    }
}
