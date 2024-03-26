package Page28.Task2828;

import java.util.ArrayList;
import java.util.List;

public class CheckIfAStringIsAnAchronymOfWords {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();


        //System.out.println(new CheckIfAStringIsAnAchronymOfWords().isAcronym());
    }
    public boolean isAcronym(List<String> words, String s) {
        if (words.size() != s.length()){
            return false;
        }
        for (int i = 0; i < words.size(); i++){
            if (words.get(i).charAt(0) != s.charAt(i)){
                return false;
            }
        }
        return true;
    }
}
