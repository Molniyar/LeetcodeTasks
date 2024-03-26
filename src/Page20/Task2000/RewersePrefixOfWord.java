package Page20.Task2000;

public class RewersePrefixOfWord {
    public static void main(String[] args) {
        System.out.println(new RewersePrefixOfWord().reversePrefix("abcdefd", 'd'));
    }
    public String reversePrefix(String word, char ch) {
        int firstOccurence = word.indexOf(ch);
        StringBuilder left = new StringBuilder(word);
        return left.delete(firstOccurence + 1, left.length()).reverse().append(word.substring(firstOccurence + 1)).toString();
    }
}
