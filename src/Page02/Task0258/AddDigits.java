package Page02.Task0258;

public class AddDigits {
    public static void main(String[] args) {

    }
    public int addDigits(int num) {
        if (num < 10){return num;}

        int res = num % 9;

        if (res == 0){return 9;}
        return res;
    }
}
