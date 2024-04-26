package Page09.Task0844;

public class BackspaceStringCompare {
    public static void main(String[] args) {
        //System.out.println(skipCharCount("c#d#", 3));
        //System.out.println(skipCharCount("hab##", 4));
        //System.out.println(skipCharCount("####", 3));
        System.out.println(new BackspaceStringCompare().backspaceCompare("nzp#o#g", "b#nzp#o#g"));
    }
    public boolean backspaceCompare(String s, String t) {
        int i = s.length() - 1;
        int j = t.length() - 1;
        for (; i >= 0 && j >= 0; i--, j--){
            i = skipCharCount(s, i);
            j = skipCharCount(t, j);
            if (i < 0 || j < 0){
                return i < 0 && j < 0;
            }
            if (s.charAt(i) != t.charAt(j)){
                return false;
            }
            System.out.println("comparing chars " + s.charAt(i) + " " + t.charAt(j));
        }
        i = skipCharCount(s, i);
        j = skipCharCount(t, j);
        return i == j;
    }
    public static int skipCharCount(String s, int i){
        if (i < 0){
            return i;
        }
        if (s.charAt(i) == '#') {
            i--;
            for (int sCount = 1; i >= 0 && (s.charAt(i) == '#' || sCount > 0);) {
                if (s.charAt(i) == '#') {
                    i--;
                    sCount++;
                }
                else {
                    sCount--;
                    i--;
                }
            }
        }
        return i;
    }
}
