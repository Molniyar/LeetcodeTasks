package Page28.Task2810;

public class FaultyKeyboard {
    public static void main(String[] args) {
        System.out.println(new FaultyKeyboard().finalString("string"));
    }
    public String finalString(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++){
            char char_ = s.charAt(i);
            if (char_ == 'i'){
                result.reverse();
            }
            else result.append(char_);
        }
        return result.toString();
    }
}
