package Page05.Task0541;

public class ReverseStringII {
    public static void main(String[] args) {
        System.out.println(new ReverseStringII().reverseStr("a", 2));
    }
    public String reverseStr(String s, int k) {
        char[] sArray = s.toCharArray();
        for (int i = 0; i < s.length(); i += k * 2){
            StringBuilder sb = new StringBuilder();
            for (int j = i; j < k + i && j < s.length(); j++){
                sb.append(sArray[j]);
            }
            sb.reverse();
            for (int j = 0; j < sb.length(); j++){
                sArray[j + i] = sb.charAt(j);
            }
        }
        return new String(sArray);
    }
}
