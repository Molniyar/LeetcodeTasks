package Task2114_MaximumNumberOfWords;

public class MaximumNumberOfWords {
    public static void main(String[] args) {
        String[] test0 = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        String[] test1 = {"please wait", "continue to fight", "continue to win"};

        System.out.println(new MaximumNumberOfWords().mostWordsFound(test1));
    }
    public int mostWordsFound(String[] sentences) {
        int result = 0;
        for (int i = 0; i < sentences.length; i++){
            if (sentences[i].split(" ").length > result){
                result = sentences[i].split(" ").length;
            }
        }
        return result;
    }
}
