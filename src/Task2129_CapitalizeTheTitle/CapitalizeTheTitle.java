package Task2129_CapitalizeTheTitle;

public class CapitalizeTheTitle {
    public static void main(String[] args) {
        System.out.println(new CapitalizeTheTitle().capitalizeTitle("L hV"));
    }
    public String capitalizeTitle(String title) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < title.length(); i++){
            boolean needsToBeToUpperCase = false;
            char char_ = title.charAt(i);
            if (char_ != ' ' && (i == 0 || title.charAt(i - 1) == ' ')) {
                for (int j = i; j < i + 3 && j < title.length(); j++) {
                    if (title.charAt(j) == ' '){
                        break;
                    }
                    if (j == i + 2) {
                        needsToBeToUpperCase = true;
                        break;
                    }
                }
                if (needsToBeToUpperCase){
                    if (char_ >= 'a' && char_ <='z') {
                        result.append((char) (char_ + ('A' - 'a')));
                    }
                    else result.append(char_);
                }
                else if (char_ >= 'A' && char_ <='Z'){
                    result.append((char) (char_ - ('A' - 'a')));
                }
                else result.append(char_);
            }
            else if (char_ >= 'A' && char_ <='Z'){
                result.append((char) (char_ - ('A' - 'a')));
            }
            else result.append(char_);
        }
        return result.toString();
    }
}
