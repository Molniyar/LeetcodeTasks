package Page18.Task1812;

public class DetermineColorOfAChessboardSquare {
    public static void main(String[] args) {

    }
    public boolean squareIsWhite(String coordinates) {
        boolean compare = (coordinates.charAt(0) >>1) <<1 == coordinates.charAt(0);
        boolean compare2 = ((coordinates.charAt(1) -'a'+1) >>1) <<1 == coordinates.charAt(1) -'a'+1;
        if (compare == compare2){
            return false;
        }
        return true;
    }
}
