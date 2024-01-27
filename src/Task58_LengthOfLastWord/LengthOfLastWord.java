package Task58_LengthOfLastWord;

import Task1576_ReplaseAllQuastionsToAvoidConsecutiveRepeatingCharacters.ReplseQuastions;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String in = "some things are blue";
        String in1 = "do you like cheese?";
        String in2 = "i don't know...";


        System.out.println(new LengthOfLastWord().lengthOfLastWord(in));
    }
    public int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        String lastWord = words[words.length - 1];

        while (true) {
            char lastChar = lastWord.charAt(lastWord.length() - 1);
            if (lastChar == '?' || lastChar == '!' || lastChar == '.'){
                lastWord = lastWord.substring(0, lastWord.length() - 1);
            }
            else break;
        }
        return lastWord.length();
    }
}
