package Page00.Task0068;

import java.util.ArrayList;
import java.util.List;

public class TextJustification {
    public static void main(String[] args) {

    }
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> res = new ArrayList<>();

        List<String> current = new ArrayList<>();
        int numOfLetters = 0;

        for (String word : words) {
            if (word.length() + current.size() + numOfLetters > maxWidth) {

                for (int i = 0; i < maxWidth - numOfLetters; i++) {
                    current.set(i % (current.size() - 1 > 0 ? current.size() - 1 : 1), current.get(i % (current.size() - 1 > 0 ? current.size() - 1 : 1)) + " ");
                }

                StringBuilder sb = new StringBuilder();

                for (String s : current) {sb.append(s);}
                res.add(sb.toString());
                current.clear();
                numOfLetters = 0;
            }
            current.add(word);
            numOfLetters += word.length();
        }

        StringBuilder lastLine = new StringBuilder();
        for (int i = 0; i < current.size(); i++) {
            lastLine.append(current.get(i));
            if (i != current.size() - 1) lastLine.append(" ");
        }
        while (lastLine.length() < maxWidth) {lastLine.append(" ");}
        res.add(lastLine.toString());

        return res;
    }
}
