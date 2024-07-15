package Page01.Task0121;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {

    }
    public int maxProfit(int[] prices) {
        int buy = prices[0];

        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            int keep = prices[i];

            if (keep < buy) {
                buy = prices[i];
                continue;
            }
            if (keep - buy > profit) {profit = prices[i] - buy;}
        }
        return profit;
    }
}
