package Page00.Task0069;

public class Sqrt {
    public static void main(String[] args) {
        int test  = 9;
        int test1 = 16;
        int test2 = 1;
        int test3 = 7;
        int test4 = 99;
        int test5 = 2000000000;
        int test6 = 0;

        int fail = 2147395599;

        System.out.println(new Sqrt().mySqrt(fail));
    }
    public int mySqrt(int x) {
        int min = 1;
        int max = Math.min(x, (1<<16) - 1);
        for (;true;){
            int result = (max + min) / 2;
            int check = result * result;
            if (check == x){
                return result;
            }
            if (check < x && check >= 0){
                if (min == result){
                    return result;
                }
                min = result;
            }
            else max = result;
        }
    }
}
