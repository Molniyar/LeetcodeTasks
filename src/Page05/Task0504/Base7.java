package Page05.Task0504;

public class Base7 {
    public static void main(String[] args) {
        System.out.println(new Base7().convertToBase7(14));
    }
    public String convertToBase7(int num) {
        int res = 0;

        int multiple = 1;

        for (int i = num; i != 0; i /= 7){
            res += (i % 7) * multiple;

            multiple *= 10;
        }

        return res + "";
    }
}
