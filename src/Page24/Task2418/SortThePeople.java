package Page24.Task2418;

import java.util.*;

public class SortThePeople {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new SortThePeople().sortPeople(new String[]{"ng", "st", "ri"}, new int[]{3, 1, 2})));
    }
    public String[] sortPeople(String[] names, int[] heights) {
        Integer[] indexes = new Integer[names.length];
        for (int i = 0; i < names.length; i++) {
            indexes[i] = i;
        }

        Arrays.sort(indexes, Comparator.comparingInt(index -> heights[index]));

        String[] sortedArray = new String[names.length];
        for (int i = 0; i < names.length; i++) {
            sortedArray[names.length-1 - i] = names[indexes[i]];
        }

        return sortedArray;
    }
}
