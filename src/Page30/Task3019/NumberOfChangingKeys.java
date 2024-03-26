package Page30.Task3019;

public class NumberOfChangingKeys {
    public static void main(String[] args) {
        System.out.println(new NumberOfChangingKeys().countKeyChanges(""));
    }
    public int countKeyChanges(String s) {
        s = s.toLowerCase();
        char key = s.charAt(0);
        int result = 0;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) != key){
                key = s.charAt(i);
                result++;
            }
        }
        return result;
    }
}
