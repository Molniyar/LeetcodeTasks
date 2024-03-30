package Page18.Task1832;

import java.util.BitSet;

public class CheckIfTheSentenceIsPangram {
    public static void main(String[] args) {
        System.out.println(new CheckIfTheSentenceIsPangram().checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
        System.out.println(new CheckIfTheSentenceIsPangram().checkIfPangram("leetcode"));
        System.out.println(new CheckIfTheSentenceIsPangram().checkIfPangram("onrcsnlxckptsxffbyswujpamfltvmdoxovggepknmtacrjkkorjgvgtgaiaudspnpxkwikevmjeephhiyvnoymjwjfopovscbefecnoytjxfwasabwohqujwowmakpyuuqvgfab"));
        System.out.println(new CheckIfTheSentenceIsPangram().checkIfPangram("abccb"));
    }
    public boolean checkIfPangram(String sentence) {
        int keep = 0;
        for (int i = 0; i < sentence.length(); i++){
            keep = keep | (1 << (sentence.charAt(i) - 'a'));
        }
        return keep == (1 << 26) - 1;
    }
}
