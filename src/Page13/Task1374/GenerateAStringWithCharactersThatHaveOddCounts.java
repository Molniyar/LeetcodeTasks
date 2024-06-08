package Page13.Task1374;

public class GenerateAStringWithCharactersThatHaveOddCounts {
    public static void main(String[] args) {

    }
    public String generateTheString(int n) {
        StringBuilder result = new StringBuilder(n);
        boolean shouldBeAdded = false;
        if (n % 2 == 0){
            shouldBeAdded = true;
            n--;
        }
        for (int i = 0; i < n; i++){
            result.append('a');
        }
        if (shouldBeAdded){
            result.append('b');
        }
        return result.toString();
    }
}
