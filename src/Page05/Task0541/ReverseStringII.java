package Page05.Task0541;

public class ReverseStringII {
    public static void main(String[] args) {
        System.out.println(new ReverseStringII().reverseStr("cgcgcgcgcgcg", 2));
        System.out.println(new ReverseStringII().reverseStr("a", 2));
        //System.out.println(reverse(new char[] {'a','b','c'}, 2));
    }
    public String reverseStr(String s, int k) {
        char[] sArray = s.toCharArray();
        for (int i = 0; i < s.length(); i+= k*2){
            reverse(sArray, i,k + i);
        }
        return new String(sArray);
    }
    public static void reverse(char[] chars, int min, int max) {
        int cut = max-1;
        if (chars.length < max){
            cut = chars.length-1;
        }
        for (int i = min, j = cut; i < j; i++, j--){
            char keep = chars[j];
            chars[j] = chars[i];
            chars[i] = keep;
        }
    }
}
