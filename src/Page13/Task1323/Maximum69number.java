package Page13.Task1323;

public class Maximum69number {
    public static void main(String[] args) {
        System.out.println(new Maximum69number().maximum69Number(9966));
    }
    public int maximum69Number (int num) {
        int preResult = 0;
        for (int i = num; i != 0; i /= 10){
            int digit = (i % 10);
            preResult *= 10;
            preResult += digit;
        }
        int result = 0;

        int i = preResult;
        for (; i != 0; i /= 10){
            int digit = (i % 10);
            result *= 10;

            if (digit == 6){
                result += 9;
                break;
            }
            else result += digit;
        }
        i /= 10;
        for (; i != 0; i /= 10){
            result *= 10;
            result+= i % 10;
        }
        return result;
    }
}
