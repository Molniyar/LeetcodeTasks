package Task557_ReverseWordsInAStringIII;

public class ReverseWordsInAStringIII {
    public static void main(String[] args) {
        System.out.println(new ReverseWordsInAStringIII().reverseWords("Let's take LeetCode contest"));
    }
    public String reverseWords(String s) {
        String[] split = s.split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < split.length; i++){
            StringBuilder str = new StringBuilder(split[i]);
            result.append(str.reverse());
            if (i < split.length - 1){
                result.append(" ");
            }
        }
        return result.toString();
    }
}
