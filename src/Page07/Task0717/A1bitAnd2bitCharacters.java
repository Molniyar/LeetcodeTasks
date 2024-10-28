package Page07.Task0717;

public class A1bitAnd2bitCharacters {
    public static void main(String[] args) {

    }
    public boolean isOneBitCharacter(int[] bits) {
        boolean oneBit = false;

        for (int i = 0; i < bits.length; i++){
            if (bits[i] == 1){
                oneBit = false;
                i++;
                continue;
            }
            oneBit = true;
        }

        return oneBit;
    }
}
