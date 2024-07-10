package Page06.Task0657;

public class RobotReturnToOrigin {
    public static void main(String[] args) {

    }
    public boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;

        for (int i = 0; i < moves.length(); i++){
            switch (moves.charAt(i)){
                case 'U' -> y--;
                case 'D' -> y++;
                case 'L' -> x--;
                case 'R' -> x++;
            }
        }

        return x == 0 && y == 0;
    }
}
