package Page20.Task2000;

public class RewersePrefixOfWord {
    public static void main(String[] args) {
        System.out.println(new RewersePrefixOfWord().reversePrefix("abcdefd", 'd'));
    }
    public String reversePrefix(String word, char ch) {
        char[] chars = word.toCharArray();
        int char_ = 0;
        for (int i = 0;i < chars.length;i++){
            if (chars[i] == ch){
                char_ = i;
                break;
            }
        }
        for (int i = 0, j = char_; i < j;i++,j--){
            char keep = chars[i];
            chars[i] = chars[j];
            chars[j] = keep;
        }
        return new String(chars);
    }
}
