package Task69_Sqrt;

public class Sqrt {
    public static void main(String[] args) {
        int test  = 9;
        int test1 = 16;
        int test2 = 1;
        int test3 = 7;
        int test4 = 99;
        int test5 = 2000000000;


        System.out.println(new Sqrt().mySqrt(test5));
    }
    public int mySqrt(int x) {
        int result = 1;
        String s = x + "";
        int r = Integer.parseInt(s.substring(s.length() / 2));

        for (;true;){
            if (result * result > x){
                result = result * 10;
            }
            else break;
        }
        for (;true;){
            if (result * result > x){

            }
            if (result * result < x){

            }
        }
        /*
        for (;true;){

            if (result * result == x){
                return result;
            }
            else result = result + 1;

            if (result * result > x || (result - 1) * (result - 1) < x){
                return result - 1;
            }

            if (result * result > x){
                result = result * 10;
            }
            if (result * result < x){
                result--;
            }
        }
         */
    }
}
