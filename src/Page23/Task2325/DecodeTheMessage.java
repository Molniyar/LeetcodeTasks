package Page23.Task2325;

import java.util.HashMap;

public class DecodeTheMessage {
    public static void main(String[] args) {
        System.out.print(new DecodeTheMessage().decodeMessage("the quick brown fox jumps over the lazy dog","vkbs bs t suepuv"));
    }
    public String decodeMessage(String key, String message) {
        HashMap<Character,Character> map = new HashMap<>();
        int m = 0;
        for (int i = 0; i < key.length(); i++){
            if ((key.charAt(i) > 'z' || key.charAt(i) < 'a')||map.containsKey(key.charAt(i))){
                m++;
                continue;
            }
            map.put(key.charAt(i),(char)(i + 'a' - m));
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < message.length(); i++){
            char char_ = message.charAt(i);
            if (char_ > 'z' || char_ < 'a'){
                result.append(char_);
            }
            else{
                result.append(map.get(char_));
            }
        }
        return result.toString();
    }
}
