package Task2129_CapitalizeTheTitle;

public class CapitalizeTheTitle {
    public static void main(String[] args) {
        System.out.println(new CapitalizeTheTitle().capitalizeTitle("First leTTeR of EACH Word"));
    }
    public String capitalizeTitle(String title) {
        String[] split = title.split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < split.length; i++){
            StringBuilder base = new StringBuilder(split[i].toLowerCase());
            if (split[i].length() < 3){
                result.append(base);
            }
            else{
                result.append((base.charAt(0) + "").toUpperCase()).append(base.deleteCharAt(0));
            }
            if (i < split.length - 1){
                result.append(" ");
            }
        }
        return result.toString();
    }
}
