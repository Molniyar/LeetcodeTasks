package Task119_PascalsTriangle_II;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle_II {
    public static void main(String[] args) {
        System.out.println(new PascalsTriangle_II().getRow(5));
    }
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>(rowIndex + 1);
        for (int i = 0; i < rowIndex + 1; i++){
            result.add(0);
        }
        for (int i = 0; i <= rowIndex; i++){
            for (int j = i - 1; j > 0; j--){
                result.set(j, (result.get(j) + result.get(j - 1)));
            }
            result.set(i, 1);
        }
        return result;
    }
}
