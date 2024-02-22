package Task1678_GoalParserInterpretation;

import java.util.ArrayList;
import java.util.List;

public class GoalParserInterpretation {
    public static void main(String[] args) {

        System.out.println(new GoalParserInterpretation().interpret("G()(al)"));
    }
    public String interpret(String command) {
        StringBuilder result = new StringBuilder();
        List<String> split = new ArrayList<>();
        for (int i = 0; i < command.length(); i++){
            switch (command.charAt(i)){
                case 'G': {
                    result.append("G");
                    break;
                }
                case '(': {
                    int count = 0;
                    if (command.charAt(Math.clamp(i + 1, 0, command.length() - 1)) == 'a' && command.charAt(Math.clamp(i + 2, 0, command.length() - 1)) == 'l' && command.charAt(Math.clamp(i + 3, 0, command.length() - 1)) == ')'){
                        count = 2;
                    }
                    if (command.charAt(Math.clamp(i + 1, 0, command.length() - 1)) == ')'){
                        count++;
                    }
                    if (count == 1){
                        result.append("o");
                    }
                    else if (count == 2){
                        result.append("al");
                    }
                }
            }
        }
        return result.toString();
    }
}
