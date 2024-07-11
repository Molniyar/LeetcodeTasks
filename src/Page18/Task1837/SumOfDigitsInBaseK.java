package Page18.Task1837;

import java.awt.*;

public class SumOfDigitsInBaseK {
    public static void main(String[] args) {
        System.out.println(new SumOfDigitsInBaseK().sumBase(34,6));
    }
    public int sumBase(int n, int k) {
        int res = 0;

        do {
            res += (n % k);
            n /= k;
        } while (n != 0);

        return res;
    }
}
