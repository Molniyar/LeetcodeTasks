package Task118_pascalsTriangle;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {
        System.out.println(new PascalsTriangle().generate(7));
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < numRows; i++){
            result.add(new ArrayList<>());
            for (int j2 = 0; j2 <= i; j2++){
                result.get(i).add(1);
            }
            if (i > 1) {
                for (int j = 0; j < i - 1; j++) {
                    int minusI = i - 1;
                    if (minusI >= result.size()){
                        minusI = result.size() - 1;
                    }
                    //result.get(i + 1).add(j, )
                    int plusJ = j + 1;
                    if (plusJ >= result.get(minusI).size()){
                        plusJ = result.get(minusI).size() - 1;
                    }
                    int a = result.get(minusI).get(j);
                    int b = result.get(minusI).get(plusJ);
                    result.get(i).set(j + 1,a + b);
                }
            }
        }
        return result;
    }
}
