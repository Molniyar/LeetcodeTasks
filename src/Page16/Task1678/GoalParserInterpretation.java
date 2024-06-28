package Page16.Task1678;

public class GoalParserInterpretation {
    public static void main(String[] args) {

        System.out.println(new GoalParserInterpretation().interpret("G()(al)"));
    }
    public String interpret(String command) {
        StringBuilder result = new StringBuilder(command.length());
        for (int i = 0; i < command.length(); i++){
            switch (command.charAt(i)){
                case 'G'-> result.append("G");
                case '('-> {
                    switch (command.charAt(i + 1)){
                        case 'a' -> result.append("al");
                        case ')' -> result.append("o");
                    }
                }
            }
        }
        return result.toString();
    }
}
