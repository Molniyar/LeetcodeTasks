package Page28.Task2864;

public class MaximumOddBinaryNumber  {
    public static void main(String[] args) {
        System.out.println(new MaximumOddBinaryNumber().maximumOddBinaryNumber("1011110"));
    }
    public String maximumOddBinaryNumber(String s) {
        StringBuilder result = new StringBuilder();
        int bitCount = -1;
        for (int i = 0; i < s.length(); i++){
            char char_ = s.charAt(i);
            if (char_ == '1'){
                bitCount++;
            }
        }
        char add = '1';
        for (int i = 0; i < s.length() - 1; i++){
            if (bitCount == 0){
                add = '0';
            }
            result.append(add);
            bitCount--;
        }
        result.append('1');
        return result.toString();
    }
}
