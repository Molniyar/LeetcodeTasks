package Task2278_PercentageOfLetter;

public class PercentageOfLetter {
    public static void main(String[] args) {
        System.out.println(new PercentageOfLetter().percentageLetter("foobar", 'o'));
    }
    public int percentageLetter(String s, char letter) {
        int equalCharCount = 0;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == letter){
                equalCharCount++;
            }
        }
        return 100 / s.length() * equalCharCount;
    }
}
