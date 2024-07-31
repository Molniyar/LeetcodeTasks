package Page07.Task0717;

public class A1bitAnd2bitCharacters {
    public static void main(String[] args) {

    }
    public boolean isOneBitCharacter(int[] bits) {
        int count = 0;

        for(int i = bits.length-2; i >= 0 && bits[i] != 0; i--){
            count++;
        }

        return count%2 == 0;
    }
}
