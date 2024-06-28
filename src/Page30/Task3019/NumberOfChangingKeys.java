package Page30.Task3019;

public class NumberOfChangingKeys {
    public static void main(String[] args) {
        System.out.println(new NumberOfChangingKeys().countKeyChanges("AaAaAaaA"));
    }
    public int countKeyChanges(String s) {
        char key = s.charAt(0);
        if (key >= 'A' && key <= 'Z'){key -= (char) ('A'-'a');}
        int result = 0;
        for (int i = 0; i < s.length(); i++){
            char char_ = s.charAt(i);
            if (char_ >= 'A' && char_ <= 'Z'){
                char_ -= (char) ('A'-'a');
            }
            if (char_ != key){
                key = char_;
                result++;
            }
        }
        return result;
    }
}
