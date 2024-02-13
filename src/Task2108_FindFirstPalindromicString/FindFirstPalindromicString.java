package Task2108_FindFirstPalindromicString;

public class FindFirstPalindromicString {
    public static void main(String[] args) {
        String[] test  = {"sdfgh", "dfghgfd", "vbn"};
        String[] test1 = {"werrew", "dfgh", "rtgfv"};
        String[] test2 = {"abc","car","ada","racecar","cool"};
        String[] test3 = {"abc","dfgfd","ada","book"};

        System.out.println(new FindFirstPalindromicString().firstPalindrome(test3));
    }
    public String firstPalindrome(String[] words) {
        String result = "";
        for (int i = 0; i < words.length; i++){
            String reverse = "";
            for (int j = words[i].length() - 1; j >= 0; j--){
                reverse = reverse + words[i].charAt(j);
            }
            if (reverse.equals(words[i])){
                result = words[i];
                break;
            }
            else reverse = "";
        }
        return result;
    }
}
