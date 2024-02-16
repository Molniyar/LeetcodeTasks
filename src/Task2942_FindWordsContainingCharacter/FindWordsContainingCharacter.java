package Task2942_FindWordsContainingCharacter;

import java.util.ArrayList;
import java.util.List;

public class FindWordsContainingCharacter {
    public static void main(String[] args) {
        String[] test0 = {"leet", "code"};
        String[] test1 = {"zero", "one", "two"};
        char char0 = 'e';
        char char1 = 'o';
        char char1_1 = 'x';
        char char1_2 = 'z';

        System.out.print(new FindWordsContainingCharacter().findWordsContaining(test1, char1_1));
    }
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < words.length; i++){
            for (int char_ = 0; char_ < words[i].length(); char_++){
                if (words[i].charAt(char_) == x){
                    result.add(i);
                    break;
                }
            }
        }
        return result;
    }
}
