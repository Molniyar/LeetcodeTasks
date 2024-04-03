package Page27.Task1720;

import java.util.Arrays;

public class DecodeXORedArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new DecodeXORedArray().decode(new int[]{1, 2, 3}, 1)));// 1,0,2,1
    }
    public int[] decode(int[] encoded, int first) {
        int[] result = new int[encoded.length + 1];
        result[0] = first;
        int num = first;
        for (int i = 0; i < encoded.length; i++){
            int n = num ^ encoded[i];
            result[i + 1] = n;
            num = n;
        }
        return result;
    }
}
