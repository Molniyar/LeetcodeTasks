package Page31.Task3168;

public class MinimumNumberOfChairsInAWaitingRoom {
    public static void main(String[] args) {

    }
    public int minimumChairs(String s) {
        int res = 0;

        int count = 0;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == 'E'){
                count++;
                if (count > res){
                    res = count;
                }
            }
            else count--;
        }

        return res;
    }
}
