package Page02.Task0258;

public class AddDigits {
    public static void main(String[] args) {

    }
    public int addDigits(int num) {
        for (;;) {
            int keep = 0;
            for (int i = num; i != 0; i /= 10) {
                keep += (i % 10);
            }
            if (keep < 10){
                return keep;
            }
            num = keep;
        }
    }
}
