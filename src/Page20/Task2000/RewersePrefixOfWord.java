package Page20.Task2000;

public class RewersePrefixOfWord {
    public static void main(String[] args) {
        System.out.println(new RewersePrefixOfWord().reversePrefix("abcdefd", 'd'));
    }
    public String reversePrefix(String word, char ch) {
        char[] chars = word.toCharArray();

        for (int i = 0, j = word.indexOf(ch); i < j;i++,j--){
            char keep = chars[i];
            chars[i] = chars[j];
            chars[j] = keep;
        }
        return new String(chars);
    }
}
