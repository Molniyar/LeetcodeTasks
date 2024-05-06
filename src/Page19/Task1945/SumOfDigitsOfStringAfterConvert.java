package Page19.Task1945;

public class SumOfDigitsOfStringAfterConvert {
    public static void main(String[] args) {
        System.out.println(new SumOfDigitsOfStringAfterConvert().getLucky("hvmhoasabaymnmsd", 1));
    }
    public int getLucky(String s, int k) {
        int result = 0;
        for (int i = 0; i < s.length(); i++){
            for (int j = s.charAt(i)-'a'+1; j != 0; j /= 10){
                result+= (j % 10);
            }
        }
        for (int i = 0; i < k-1; i++){
            int keep = 0;
            for (int j = result; j != 0; j /= 10){
                keep += (j % 10);
            }
            result = keep;
        }
        return result;
    }
}
