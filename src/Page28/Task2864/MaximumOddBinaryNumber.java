package Page28.Task2864;

public class MaximumOddBinaryNumber  {
    public static void main(String[] args) {
        System.out.println(new MaximumOddBinaryNumber().maximumOddBinaryNumber("1011110"));
    }
    public String maximumOddBinaryNumber(String s) {
        char[] chars = new char[s.length()];
        int bitCount = -1;
        for (int i = 0; i < s.length(); i++){
            char char_ = s.charAt(i);
            chars[i] = '0';
            if (char_ == '1'){
                bitCount++;
            }
        }
        boolean hasBit = true;
        int c = 0;
        for (int i = 0; i < s.length() - 1; i++){
            if (bitCount == 0){
                hasBit = false;
            }
            if (hasBit){
                chars[i] = '1';
            }
            bitCount--;
        }
        chars[s.length()-1] = ('1');
        return new String(chars);
    }
}
