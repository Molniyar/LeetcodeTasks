package Task1672_RichestCustomerWealth;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] test0 = {{1,2,3},{3,2,1}};
        int[][] test1 = {{1,3},{8,1},{2,1},{5,6}};

        System.out.println(new RichestCustomerWealth().maximumWealth(test1));
    }
    public int maximumWealth(int[][] accounts) {
        int result = 0;
        for (int i = 0; i < accounts.length; i++){
            int preResult = 0;
            for (int j = 0; j < accounts[0].length; j++){
                preResult = preResult + accounts[i][j];
            }
            if (preResult > result){
                result = preResult;
            }
        }
        return result;
    }
}
