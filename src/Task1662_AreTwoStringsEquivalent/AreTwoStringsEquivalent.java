package Task1662_AreTwoStringsEquivalent;

public class AreTwoStringsEquivalent {
    public static void main(String[] args) {
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};
        System.out.println(new AreTwoStringsEquivalent().arrayStringsAreEqual(word1, word2));
    }
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder first = new StringBuilder();
        for (String s : word1) {
            first.append(s);
        }
        StringBuilder second = new StringBuilder();
        for (String s : word2) {
            second.append(s);
        }
        return first.toString().contentEquals(second);
    }
}
