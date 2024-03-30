package Page13.Task1323;

public class Maximum69number {
    public static void main(String[] args) {
        System.out.println(new Maximum69number().maximum69Number(9966));
    }
    public int maximum69Number (int num) {
        boolean canBeChanged = true;
        int preResult = 0;
        for (int i = num; i != 0; i /= 10){
            int digit = (i % 10);
            preResult *= 10;
            preResult += digit;
        }
        int result = 0;
        for (int i = preResult; i != 0; i /= 10){
            int digit = (i % 10);
            result *= 10;

            if (digit == 6 && canBeChanged){
                result += 9;
                canBeChanged = false;
            }
            else result += digit;
        }
        return result;
    }
}
