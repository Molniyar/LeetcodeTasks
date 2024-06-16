package Page18.Task1844;

public class ReplaceAllDigitsWithCharacters {
    public static void main(String[] args) {
        System.out.println(new ReplaceAllDigitsWithCharacters().replaceDigits("a1c1e1"));
    }
    public String replaceDigits(String s) {
        char[] str = s.toCharArray();
        for (int i = 0; i < str.length;i++){
            char char_ = str[i];
            if (char_ >= '0' && char_ <= '9'){
                str[i] = (char)(str[i-1]+(char_-'0'));
            }
        }
        return new String(str);
    }
}
