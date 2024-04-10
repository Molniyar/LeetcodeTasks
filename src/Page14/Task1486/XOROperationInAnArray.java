package Page14.Task1486;

public class XOROperationInAnArray {
    public static void main(String[] args) {
        System.out.println(new XOROperationInAnArray().xorOperation(4,3));
    }
    public int xorOperation(int n, int start) {
        int result = 0;
        for (int i = 0; i < n; i++){
            result ^= start + i * 2;
        }
        return result;
    }

}
