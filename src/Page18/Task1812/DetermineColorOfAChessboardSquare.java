package Page18.Task1812;

public class DetermineColorOfAChessboardSquare {
    public static void main(String[] args) {

    }
    public boolean squareIsWhite(String coordinates) {
        return (coordinates.charAt(0) + coordinates.charAt(1))%2 != 0;
    }
}
