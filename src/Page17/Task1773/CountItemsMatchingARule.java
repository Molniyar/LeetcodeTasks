package Page17.Task1773;

import java.util.List;
import java.util.Objects;

public class CountItemsMatchingARule {
    public static void main(String[] args) {

    }
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int index = 0;
        switch (ruleKey){
            case "color" -> index = 1;
            case "name" -> index = 2;
        }
        int result = 0;
        for (int i = 0; i < items.size();i++){
            if (Objects.equals(items.get(i).get(index), ruleValue)){result++;}
        }
        return result;
    }
}
