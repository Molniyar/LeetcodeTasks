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
            String s = i + "";
            int count = 0;
            for (int j = 0; j < s.length(); j++){
                if (s.charAt(j) - 48 == 0){
                    break;
                }
                if ((i) % (s.charAt(j) - 48) == 0){
                    count++;
                }
                else break;
            }
            if (count == s.length()){
                result.add(i);
            }
        }
        return result;
    }
}
