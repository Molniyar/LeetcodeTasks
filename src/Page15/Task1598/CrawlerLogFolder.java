package Page15.Task1598;

public class CrawlerLogFolder {
    public static void main(String[] args) {
        System.out.println(new CrawlerLogFolder().minOperations(new String[]{"d1/", "d2/", "../", "d21/", "./"}));
    }
    public int minOperations(String[] logs) {
        int result = 0;
        for (String log : logs) {
            switch (log) {
                case "../" -> {
                    if (result > 0){
                        result--;
                    }
                }
                case "./" -> {
                }
                default -> result++;
            }
        }
        return result;
    }
}
