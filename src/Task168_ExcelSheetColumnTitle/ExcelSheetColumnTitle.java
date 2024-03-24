package Task168_ExcelSheetColumnTitle;

public class ExcelSheetColumnTitle {
    public static void main(String[] args) {
        System.out.println(new ExcelSheetColumnTitle().convertToTitle(28));
    }
    public String convertToTitle(int columnNumber) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";//26
        StringBuilder result = new StringBuilder();
        for (;true;) {
            int count = 0;
            for (; true; ) {
                if (columnNumber > 26) {
                    columnNumber -= 26;
                    count++;
                } else break;
            }
            result.append(chars.charAt(columnNumber - 1));
            columnNumber = count;
            if (columnNumber == 0){
                break;
            }
        }
        return result.reverse().toString();
    }
}
