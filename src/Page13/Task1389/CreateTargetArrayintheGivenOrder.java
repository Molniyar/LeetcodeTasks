package Page13.Task1389;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreateTargetArrayintheGivenOrder {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new CreateTargetArrayintheGivenOrder().createTargetArray(new int[]{1,2,3,4,0}, new int[]{0,1,2,3,0})));
    }
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> result = new ArrayList<>();
        //int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++){
            result.add(index[i], nums[i]);
        }
        return toIntArray(result);
    }
    int[] toIntArray(List<Integer> result) {
        int[] ret = new int[result.size()];
        for(int i = 0; i < ret.length; i++)
            ret[i] = result.get(i);
        return ret;
    }
}
