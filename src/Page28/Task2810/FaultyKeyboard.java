package Page28.Task2810;

public class FaultyKeyboard {
    public static void main(String[] args) {
        System.out.println(new FaultyKeyboard().finalString2("12i345i6i789i"));//987543126
        System.out.println(new FaultyKeyboard().finalString("12i345i6i789i"));//987543126
        System.out.println();
        System.out.println(new FaultyKeyboard().finalString2("12i345i6i789"));//987543126
        System.out.println(new FaultyKeyboard().finalString("12i345i6i789"));//987543126
    }
    public String finalString(String s) {
        int length = s.length();
        StringBuilder str1 = new StringBuilder(length);
        StringBuilder str2 = new StringBuilder(length);
        boolean addAtFirstStr = false;
        for (int i = 0; i < length; i++){
            char char_ = s.charAt(i);
            if (char_ == 'i'){
                addAtFirstStr = !addAtFirstStr;
                continue;
            }
            if (addAtFirstStr){
                str1.append(char_);
            }
            else str2.append(char_);
        }

        if (addAtFirstStr){
            str2.reverse();
            return str2.append(str1).toString();
        }
        else {
            str1.reverse();
        }
        return str1.append(str2).toString();
    }
    public String finalString2(String s) {
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
