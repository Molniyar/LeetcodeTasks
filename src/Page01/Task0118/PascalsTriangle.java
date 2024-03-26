package Page01.Task0118;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {
        System.out.println(new PascalsTriangle().generate(7));
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>(numRows);
        List<Integer> previous = new ArrayList<>(1);
        previous.add(1);
        result.add(previous);
        for (int i = 1; i < numRows; i++){
            List<Integer> current = new ArrayList<>(i + 1);
            current.add(1);
            for (int j = 1; j < i; j++) {
                int a = previous.get(j - 1);
                int b = previous.get(j);
                current.add(a + b);
            }
            current.add(1);

            result.add(current);
            previous = current;
        }
        return result;
    }
}
