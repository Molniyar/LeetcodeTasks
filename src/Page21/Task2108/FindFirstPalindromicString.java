package Page21.Task2108;

public class FindFirstPalindromicString {
    public static void main(String[] args) {
        String[] test  = {"sdfgh", "dfghgfd", "vbn"};
        String[] test1 = {"werrew", "dfgh", "rtgfv"};
        String[] test2 = {"abc","car","ada","racecar","cool"};
        String[] test3 = {"abc","dfgfd","ada","book"};

        System.out.println(new FindFirstPalindromicString().firstPalindrome(test2));
    }
    public String firstPalindrome(String[] words) {
        for (int i = 0; i < words.length; i++){
            boolean isPalindrome = true;
            for (int j = 0; j < words[i].length() / 2; j++){
                if (words[i].charAt(j) != words[i].charAt(words[i].length() - 1 - j)){
                    isPalindrome = false;
                    break;
                }
            }
            if (isPalindrome){
                return words[i];
            }
        }
        return "";
    }
}
