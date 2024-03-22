package Task1528_ShuffleString;

public class ShuffleString {
    public static void main(String[] args) {
        System.out.println(new ShuffleString().restoreString("codeleet", new int[]{4, 5, 6, 7, 0, 2, 1, 3}));
    }
    public String restoreString(String s, int[] indices) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++){
            int index = 0;
            for (int j = 0; true; j++){
                if (indices[j] == i){
                    break;
                }
                index++;
            }
            result.append(s.charAt(index));
        }
        return result.toString();
    }
}
