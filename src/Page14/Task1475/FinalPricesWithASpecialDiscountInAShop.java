package Page14.Task1475;

public class FinalPricesWithASpecialDiscountInAShop {
    public static void main(String[] args) {

    }
    public int[] finalPrices(int[] prices) {
        for (int i = 0; i < prices.length-1; i++){
            int index = i+1;

            boolean isLower = false;

            for (; index < prices.length; index++){
                if (prices[i] >= prices[index]){
                    isLower = true;
                    break;
                }
            }

            if (isLower){
                prices[i]-=prices[index];
            }
        }
        return prices;
    }
}
