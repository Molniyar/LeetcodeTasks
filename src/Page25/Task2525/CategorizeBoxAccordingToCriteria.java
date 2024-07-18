package Page25.Task2525;

public class CategorizeBoxAccordingToCriteria {
    public static void main(String[] args) {
        System.out.println(new CategorizeBoxAccordingToCriteria().categorizeBox(2227,937,2241,983));
    }
    public String categorizeBox(int length, int width, int height, int mass) {
        long volume = (long) length *width*height;

        boolean isBulky = (length >= 10000 || width >= 10000 || height >= 10000) || (volume >= 1000000000);
        boolean isHeavy = mass >= 100;

        if (isBulky){
            if (isHeavy){
                return "Both";
            }
            return "Bulky";
        }

        if (isHeavy){
            return "Heavy";
        }
        return "Neither";
    }
}
