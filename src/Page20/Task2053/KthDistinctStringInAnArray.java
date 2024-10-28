package Page20.Task2053;

import java.util.HashMap;

public class KthDistinctStringInAnArray {
    public static void main(String[] args) {

    }
    public String kthDistinct(String[] arr, int k) {
        HashMap<String,Integer> counts = new HashMap<>();
        for (String n : arr) {
            counts.put(n, counts.getOrDefault(n, 0) + 1);
        }

        for (String n : arr) {
            if (counts.get(n) == 1) {
                k--;
                if (k == 0) {
                    return n;
                }
            }
        }
        return "";
    }
}
