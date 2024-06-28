package Page07.Task0709;

public class ToLowerCase {
    public static void main(String[] args) {
        System.out.println(new ToLowerCase().toLowerCase("Integer"));
    }
    public String toLowerCase(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++){
            char sChar = s.charAt(i);
            if (sChar >= 'A' && sChar <= 'Z'){
                result.append((char)(sChar + 'a' - 'A'));
            }
            else result.append(sChar);
        }
        return result.toString();
    }
}
