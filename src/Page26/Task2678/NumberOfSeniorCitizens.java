package Page26.Task2678;

public class NumberOfSeniorCitizens {
    public static void main(String[] args) {
        System.out.println(new NumberOfSeniorCitizens().countSeniors(new String[]{"5612624052M0130","5378802576M6424","5447619845F0171","2941701174O9078"}));
    }
    public int countSeniors(String[] details) {
        int res = 0;

        for (int i = 0; i < details.length; i++){
            if ((details[i].charAt(11)-'0')*10 +(details[i].charAt(12)-'0') > 60){
                res++;
            }
        }

        return res;
    }
}
