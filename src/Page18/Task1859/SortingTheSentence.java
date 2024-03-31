package Page18.Task1859;

public class SortingTheSentence {
    public static void main(String[] args) {
        System.out.println(new SortingTheSentence().sortSentence("is2 sentence4 This1 a3"));
        System.out.println(new SortingTheSentence().sortSentence("Myself2 Me1 I4 and3"));
    }
    public String sortSentence(String s) {
        int wordsCount = 1;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == ' '){
                wordsCount++;
            }
        }
        String[] sArrayInRightOrder = new String[wordsCount];
        int startIndex = 0;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == ' '){
                
            }
        }

    }
}
