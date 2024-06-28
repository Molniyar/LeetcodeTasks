package Page13.Task1309;

import java.util.Arrays;
import java.util.StringJoiner;

public class DecryptStringFromAlphabetToIntegerMapping {
    public static void main(String[] args) {
        System.out.println(new DecryptStringFromAlphabetToIntegerMapping().freqAlphabets("10#11#12"));
    }
    public String freqAlphabets(String s) {
        int l = 0;
        for (int i = s.length()-1; i >= 0; i--){
            if (s.charAt(i) == '#'){
                l++;
                i-=2;
                continue;
            }
            l++;
        }

        char[] res = new char[l];

        for (int i = s.length()-1, I = l-1; i >= 0; i--, I--){
            if (s.charAt(i) == '#'){
                res[I] = (char)((s.charAt(i-1)-'0'+(s.charAt(i-2)-'0')*10)  +'a' -1);
                i-=2;
                continue;
            }

            res[I] = (char) (s.charAt(i)-'0'+'a'-1);
        }

        return new String(res);
    }
}
