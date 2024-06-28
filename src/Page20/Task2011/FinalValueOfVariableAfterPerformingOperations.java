package Page20.Task2011;

public class FinalValueOfVariableAfterPerformingOperations {
    public static void main(String[] args) {
        String[] test  = {"--X","X++","X++"};
        String[] test1 = {"++X","X++","X--"};
        String[] test2 = {"++X","X++","X++"};

        System.out.println(new FinalValueOfVariableAfterPerformingOperations().finalValueAfterOperations(test2));
    }
    public int finalValueAfterOperations(String[] operations) {
        int result = 0;
        for (String operation : operations) {
            switch (operation) {
                case "++X", "X++" -> result++;
                case "--X", "X--" -> result--;
            }
        }
        return result;
    }
}
