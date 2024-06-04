package Page17.Task1716;

import java.awt.*;

public class CalculateMoneyInLeetcodeBank {
    public static void main(String[] args) {
        System.out.println(new CalculateMoneyInLeetcodeBank().totalMoney(10));
    }
    public int totalMoney(int n) {
        int weekSum  = (7*8)/2;//28
        int weeks = n/7;
        int addSum   = (weeks * (weeks-1) / 2) * 7;
        int bigSum   = (weeks * weekSum) + addSum;

        int days = n%7;
        int minSum   = ((days) * ((days)+1) / 2);
        int smallSum = (weeks) * days + minSum;

        return bigSum + smallSum;
    }
}
