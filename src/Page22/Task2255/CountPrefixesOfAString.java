package Page22.Task2255;

public class CountPrefixesOfAString {
    public static void main(String[] args) {
        //"feh","w","w","lwd","c","s","vk","zwlv","n","w","sw","qrd","w","w","mqe","w","w","w","gb","w","qy","xs","br","w","rypg","wh","g","w","w","fh","w","w","sccy"
        System.out.println(new CountPrefixesOfAString().countPrefixes(new String[]{"feh","w","w","lwd","c","s","vk","zwlv","n","w","sw","qrd","w","w","mqe","w","w","w","gb","w","qy","xs","br","w","rypg","wh","g","w","w","fh","w","w","sccy"}, "w"));
    }
    public int countPrefixes(String[] words, String s) {
        int result = 0;
        for (int i = 0; i < words.length; i++){
            boolean isPrefix = true;
            if (words[i].length() <= s.length()) {
                for (int j = 0; j < words[i].length() && j < s.length(); j++) {
                    if (words[i].charAt(j) != s.charAt(j)) {
                        isPrefix = false;
                        break;
                    }

                }
                if (isPrefix) {
                    result++;
                }
            }
        }
        return result;
    }
}
