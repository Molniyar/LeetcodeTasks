package Page15.Task1550;

public class ThreeConsecutiveOdds {
    public static void main(String[] args) {

    }
    public boolean threeConsecutiveOdds(int[] arr) {
        int repeats = 0;

        for (int i = 0; i < arr.length; i++){
            if (arr[i]%2 == 0){
                repeats = 0;
                continue;
            }

            repeats++;

            if (repeats == 3){
                return true;
            }
        }

        return false;
    }
}
