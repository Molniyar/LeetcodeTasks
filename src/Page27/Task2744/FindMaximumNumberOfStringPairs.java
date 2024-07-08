package Page27.Task2744;

public class FindMaximumNumberOfStringPairs {
    public static void main(String[] args) {

    }
    public int maximumNumberOfStringPairs(String[] words) {
        int l = words.length;
        int repeats = 0;

        for(int i = 0; i < l; i++){
            for(int j = i + 1; j < l; j++) {
                if (words[i].charAt(0) == words[j].charAt(1) && words[i].charAt(1) == words[j].charAt(0)) {
                    repeats++;
                }
            }
        }

        return repeats;
    }
}
