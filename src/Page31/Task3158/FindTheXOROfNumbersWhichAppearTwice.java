package Page31.Task3158;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class FindTheXOROfNumbersWhichAppearTwice {
    public static void main(String[] args) {

    }
    public int duplicateNumbersXOR(int[] nums) {
        byte[] numCounts = new byte[50];

        for (int i = 0; i < nums.length; i++){
            numCounts[nums[i]-1]++;
        }

        int res = 0;
        for (int i = 0; i < numCounts.length; i++){
            if (numCounts[i] == 2){
                res ^= (i+1);
            }
        }

        return res;
    }
}
