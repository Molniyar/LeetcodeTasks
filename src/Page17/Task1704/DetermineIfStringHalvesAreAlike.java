package Page17.Task1704;

import java.util.BitSet;

public class DetermineIfStringHalvesAreAlike {
    public static void main(String[] args) {
        System.out.println(new DetermineIfStringHalvesAreAlike().halvesAreAlike("textbook"));
    }
    public boolean halvesAreAlike(String s) {
        s = s.toLowerCase();

        BitSet set = new BitSet(26);
        set.set('a'-'a');
        set.set('e'-'a');
        set.set('i'-'a');
        set.set('o'-'a');
        set.set('u'-'a');

        int c1 = 0;
        int c2 = 0;

        for (int i = 0, j = s.length()/2; j < s.length(); i++, j++){
            if (set.get(s.charAt(i)-'a')){c1++;}
            if (set.get(s.charAt(j)-'a')){c2++;}
        }

        return c1 == c2;
    }
}
