package Task1108_DefangingAnIPAdress;

public class DefangingAnIPAdress {
    public static void main(String[] args) {
        String test  = "1.1.1.1";
        String test1 = "255.100.50.0";

        System.out.print(new DefangingAnIPAdress().defangIPaddr(test));
    }
    public String defangIPaddr(String address) {
        char[] charArray = address.toCharArray();

        String result = "";
        for (int i = 0; i < charArray.length; i++){
            if (charArray[i] == '.'){
                result = result + "[" + charArray[i] + "]";
            }
            else result = result + charArray[i];
        }
        return result;
    }
}
