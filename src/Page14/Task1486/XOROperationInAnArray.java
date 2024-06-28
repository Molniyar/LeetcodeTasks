package Page14.Task1486;

public class XOROperationInAnArray {
    public static void main(String[] args) {
        for (int i = 0; i < 8; i++){
            for (int j = 0; j < 8; j++){
                //System.out.print(new XOROperationInAnArray().xorOperation2(i,j) + "  ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < 8; i++){
            for (int j = 0; j < 8; j++){
                //System.out.print(new XOROperationInAnArray().xorOperation(i,j) + "  ");
            }
            System.out.println();
        }
        for (int i = 0; i < 1000; i++){
            System.out.print(new XOROperationInAnArray().xorOperation2(3,i) + "  ");
        }
        System.out.println();
        for (int i = 0; i < 1000; i++){
            System.out.print(new XOROperationInAnArray().xorOperation(3,i) + "  ");
        }
    }
    public int xorOperation(int n, int start) {
        int result = 0;
        if (n == 0){return 0;}
        if (n == 1){return start;}
        if (n % 2 == 0) {
            if (n > 2 && Integer.bitCount(n) == 1) {
                if (start % 4 == 0 || start % 4 == 1){
                    return n * 2;
                }
                return 0;
            }
            else {
                if (start % 4 == 2 || start % 4 == 3){
                    result = n * 2 + 2;
                }
                else result = 2;
            }
        }
        if (n % 2 == 1){
            if (n % 4 == 3){
                if (start % 4 == 0 || start % 4 == 1){
                    result = n * 2 + start;
                }
            }
            if (n % 4 == 1){
                if (start % 4 == 0 || start % 4 == 1){
                    result = n + (n-2) + start;
                }
            }
            if (start % 2 == 1){
                result++;
            }
        }
        return result;
    }
    public int xorOperation2(int n, int start) {
        int result = 0;
        for (int i = 0; i < n; i++){
            //System.out.print(result + " ");
            result ^= start + i * 2;
        }
        return result;
    }

}
