package Page27.Task2744;

import java.util.BitSet;

public class FindMaximumNumberOfStringPairs {
    public static void main(String[] args) {
        System.out.println(new FindMaximumNumberOfStringPairs().maximumNumberOfStringPairs(new String[]{"xi","nw","qp","to","oo","xp","ix","wn","pq"}));
    }
    public int maximumNumberOfStringPairs(String[] words) {
        BitSet set = new BitSet(676);
        int repeats = 0;

        for (String word : words){
            int index      = (word.charAt(0)-'a'+1) + (word.charAt(1)-'a'+1)*26;
            int otherIndex = (word.charAt(1)-'a'+1) + (word.charAt(0)-'a'+1)*26;

            if (set.get(index) && set.get(otherIndex)){
                repeats++;
                continue;
            }
            set.set(index);
            set.set(otherIndex);
        }

        return repeats;
    }
}
