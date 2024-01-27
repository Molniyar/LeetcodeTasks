package Task58_LengthOfLastWord;

import Task1576_ReplaseAllQuastionsToAvoidConsecutiveRepeatingCharacters.ReplseQuastions;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String in = "some things are blue";
        String in1 = "do you like cheese?";
        String in2 = "i don't know...";


        System.out.println(new LengthOfLastWord().lengthOfLastWord(in2));
    }
    public int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        String lastWord = words[words.length - 1];
        char lastChar = lastWord.charAt(lastWord.length() - 1);
        while (true) {
            if (lastChar == '?' || lastChar == '!' || lastChar == '.'){
                String replaseChar = "";
                for (int i = 0; i < lastWord.length() - 1; i++){
                    replaseChar = replaseChar + lastWord.charAt(i);
                }
                lastChar = replaseChar.charAt(replaseChar.length() - 1);
                lastWord = replaseChar;
            }
            else break;
        }
        return lastWord.length();
    }
}
