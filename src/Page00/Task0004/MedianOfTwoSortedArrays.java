package Page00.Task0004;

import java.util.Arrays;

public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        int[][] test0 = {{1,2},{3,4}};//   V
        int[][] test1 = {{1,5},{2,3,9}};//     X
        int[][] test2 = {{1,2},{8,9,12}};//    X
        int[][] test3 = {{12,23,34},{1,2,3}};//V
        int[][] test4 = {{1,3},{2}};//
        System.out.println(new MedianOfTwoSortedArrays().findMedianSortedArrays(test0[0], test0[1]));
    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int [] res = new int[nums1.length+nums2.length];

        int i = 0;
        System.arraycopy(nums1, 0,res,0,nums1.length);
        System.arraycopy(nums2, 0,res,nums1.length,nums2.length);

        Arrays.sort(res);

        if (res.length%2 == 0){
            return (double) (res[res.length / 2] + res[res.length / 2 - 1]) /2;
        }
        return res[res.length/2];
    }
}
// 30 мин. времени игры за решение путём удаления элементов и массива
// 60 мин. времени игры за решение путём двоичного поиска в массивах
