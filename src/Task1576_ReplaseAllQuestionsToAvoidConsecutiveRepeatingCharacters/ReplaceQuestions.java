package Task1576_ReplaseAllQuestionsToAvoidConsecutiveRepeatingCharacters;


public class ReplaceQuestions {

    public static void main(String[] args) {
        String in = "dfji?ja?cb?e";
        String in1 = "a?bs";
        System.out.println(new ReplaceQuestions().modifyString(in));
    }
    public String modifyString(String s) {
        char[] result = s.toCharArray();

        String abc = "abc";

        for (int i = 0; i < s.length(); i++){
            if (result[i] == '?'){
                for (int j = 0; j < abc.length(); j++){
                    char replace = abc.charAt(j);

                    if (i != 0 && result[i - 1] == replace){
                        continue;
                    }
                    if (i != result.length - 1 && result[i + 1] == replace){
                        continue;
                    }

                    result[i] = replace;
                    break;
                }
            }
        }
        return new String(result);
    }
}
