package Task58_LengthOfLastWord;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String in = "some things are blue";
        String in1 = "do you like cheese?";
        String in2 = "i don't know...";


        System.out.println(new LengthOfLastWord().lengthOfLastWord(in));
    }
    public int lengthOfLastWord(String s) {
        int length = 0;
        for (int i = s.length() - 1; i >= 0; i--){
            switch (s.charAt(i)){
                case '?', '!', '.' -> {
                    continue;
                }
                case ' ' -> {
                    if (length == 0){
                        continue;
                    }
                }
                default -> {
                    length++;
                    continue;
                }
            }
            break;
        }
        return length;
    }
}
