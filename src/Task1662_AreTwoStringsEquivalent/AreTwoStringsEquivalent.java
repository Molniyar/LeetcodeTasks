package Task1662_AreTwoStringsEquivalent;

public class AreTwoStringsEquivalent {
    public static void main(String[] args) {
        String[] word1 = {"abc","d","defg"};
        String[] word2 = {"abcddef"};
        System.out.println(new AreTwoStringsEquivalent().arrayStringsAreEqual(word1, word2));
    }
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        boolean result = true;
        int count = 0;
        for (int i = 0, j = 0, i2 = 0, j2 = 0;; j++, j2++){
            if ( i >= word1.length || i2 >= word2.length){
                if (!(i >= word1.length && i2 >= word2.length)){
                    result = false;
                }
                break;
            }
            if (word1[i].charAt(j) != word2[i2].charAt(j2)){
                result = false;
                break;
            }
            if (j == word1[i].length() - 1){
                j = -1;
                i++;
            }
            if (j2 == word2[i2].length() - 1){
                j2 = -1;
                i2++;
            }
        }
        return result;
    }
}
