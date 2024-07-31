package Page30.Taske3028;

public class AntOnTheBoundary {
    public static void main(String[] args) {

    }
    public int returnToBoundaryCount(int[] nums) {
        int res = 0;

        for (int coord = 0, i = 0; i < nums.length; i++){
            coord += nums[i];
            if (coord == 0){
                res++;
            }
        }

        return res;
    }
}
