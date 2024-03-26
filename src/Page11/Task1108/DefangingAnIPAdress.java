package Page11.Task1108;

public class DefangingAnIPAdress {
    public static void main(String[] args) {
        String test  = "1.1.1.1";
        String test1 = "255.100.50.0";

        System.out.print(new DefangingAnIPAdress().defangIPaddr(test));
    }
    public String defangIPaddr(String address) {
        address = address.replace(".", "[.]");
        return address;
    }
}
