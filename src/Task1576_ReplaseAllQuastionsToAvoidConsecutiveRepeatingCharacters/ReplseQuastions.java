package Task1576_ReplaseAllQuastionsToAvoidConsecutiveRepeatingCharacters;


public class ReplseQuastions {

    public static void main(String[] args) {
        String in = "dfji?ja?cb?e";
        String in1 = "?zs";
        System.out.println(new ReplseQuastions().modifyString(in1));
    }
    public String modifyString(String s) {
        char[] result = s.toCharArray();

        String abc = "zabcdefghijklmnopqrstuvwxyza";

        for (int i = 0; i < s.length(); i++){
            if (result[i] == '?'){
                char replase = 'a';
                for (int ii = 0; ii < abc.length(); ii++){
                    replase = abc.charAt(ii);

                    int minus = i - 1;
                    if (minus < 0){
                        minus = 0;
                    }

                    int plus  = i + 1;
                    if (plus >= s.length()){
                        plus = s.length() - 1;
                    }

                    if (result[minus] == replase || result[plus] == replase){
                        replase = abc.charAt(ii + 1);
                    }
                }
                result[i] = replase;
            }
        }
        return new String(result);
    }
}
