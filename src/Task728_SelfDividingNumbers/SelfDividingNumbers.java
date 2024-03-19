package Task728_SelfDividingNumbers;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {
    public static void main(String[] args) {
        System.out.println(new SelfDividingNumbers().selfDividingNumbers(1, 22));
    }
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();
        for (int i = left; i <= right; i++){
            int divsionCount = 0;
            int count = 0;
            for (int j = i; j != 0; j /= 10){
                int digit = j % 10;
                if (digit != 0 && i % digit == 0){
                    divsionCount++;
                }
                count++;
            }
            if (divsionCount == count){
                result.add(i);
            }
        }
        return result;
    }
}
