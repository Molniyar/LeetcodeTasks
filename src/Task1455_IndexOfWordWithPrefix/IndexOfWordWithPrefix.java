package Task1455_IndexOfWordWithPrefix;

public class IndexOfWordWithPrefix {
    public static void main(String[] args) {
        System.out.println(new IndexOfWordWithPrefix().isPrefixOfWord("i love eating burger", "burg"));
    }
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] split = sentence.split(" ");
        for (int i = 0; i < split.length; i++){
            if (split[i].length() >= searchWord.length() && split[i].substring(0, searchWord.length()).equals(searchWord)){
                return i + 1;
            }
        }
        return -1;
    }
}
