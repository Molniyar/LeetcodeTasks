package Page21.Task2103;

public class RingsAndRods {
    public static void main(String[] args) {

    }
    public int countPoints(String rings) {
        byte[] rods = new byte[10];
        byte rVal = 1;
        byte gVal = 1<<1;
        byte bVal = 1<<2;

        for (int i = 0; i < rings.length(); i+=2){
            int index = rings.charAt(i+1)-'0';
            switch (rings.charAt(i)){
                case 'R' -> rods[index] |= rVal;
                case 'G' -> rods[index] |= gVal;
                case 'B' -> rods[index] |= bVal;
            }
        }

        int res = 0;

        for (int i = 0; i < rods.length; i++){
            if (rods[i] == rVal+gVal+bVal){
                res++;
            }
        }

        return res;
    }
}
