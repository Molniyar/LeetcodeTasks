package Page03.Task0338;

public class CountingBits {
    public static void main(String[] args) {

    }
    public int[] countBits(int n) {
        int[] result = new int[n+1];
        result[0] = 0;

        int Int = 1;
        for (;Int < n;n <<= 1){}

        int k = 1;

        for (int i = 0; i < result.length; i++){
            for (int j = k; j < k+k && j < result.length; j++){
                result[j] = result[j-k]+1;
            }
            k<<=1;
        }
        return result;
    }
}
