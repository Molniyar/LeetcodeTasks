package Page00.Task0075;

public class SortColors {
    public static void main(String[] args) {
        new SortColors().sortColors(new int[]{1, 0, 0, 2, 1, 2});
    }
    public void sortColors(int[] nums) {
        int red = 0;     //0
        int white = 0;   //1
        int blue = 0;    //2

        for (int i = 0; i < nums.length; i++){
            switch (nums[i]){
                case 0 -> red++;
                case 1 -> white++;
                case 2 -> blue++;
            }
        }

        int i = 0;
        int keep = 0;

        for (;i < red; i++)  {nums[i] = 0;}
        keep = i;
        for (;i < white+keep; i++){nums[i] = 1;}
        keep = i;
        for (;i < blue+keep; i++) {nums[i] = 2;}
    }
}
