package Page22.Task2220;

public class MinimumBitFlipsToConvertNumber {
    public static void main(String[] args) {
        System.out.println(new MinimumBitFlipsToConvertNumber().minBitFlips(10,7));
    }
    public int minBitFlips(int start, int goal) {
        return Integer.bitCount(start ^ goal);
    }
}
