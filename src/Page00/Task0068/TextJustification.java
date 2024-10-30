package Page00.Task0068;

import com.sun.tools.javac.Main;

import java.lang.annotation.Native;
import java.util.ArrayList;
import java.util.List;

public class TextJustification {
    public static void main(String[] args) {

    }
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> res  = new ArrayList<>();
        List<String> curr = new ArrayList<>();

        int numOfChars = 0;

        for (String word : words) {
            if (word.length() + curr.size() + numOfChars > maxWidth){
                for (int i = 0; i < maxWidth - numOfChars; i++) {
                    curr.set(i % (curr.size() - 1 > 0 ? curr.size() - 1 : 1), curr.get(i % (curr.size() - 1 > 0 ? curr.size() - 1 : 1)) + " ");
                }

                StringBuilder write = new StringBuilder();// writing the line to res
                for (String s : curr) {write.append(s);}
                res.add(write.toString());
                curr.clear();

                numOfChars = 0;
            }
            curr.add(word);
            numOfChars += word.length();
        }
        StringBuilder lastLine = new StringBuilder();
        for (int i = 0; i < curr.size(); i++){
            lastLine.append(curr.get(i));
            if (i != curr.size()-1) {lastLine.append(" ");}
        }
        while (lastLine.length() < maxWidth){lastLine.append(" ");}
        res.add(lastLine.toString());

        return res;
    }
}
