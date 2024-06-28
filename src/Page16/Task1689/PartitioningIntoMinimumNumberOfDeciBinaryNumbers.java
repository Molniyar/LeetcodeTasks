package Page16.Task1689;

public class PartitioningIntoMinimumNumberOfDeciBinaryNumbers {
    public static void main(String[] args) {
        System.out.println(new PartitioningIntoMinimumNumberOfDeciBinaryNumbers().minPartitions("12684"));
    }
    public int minPartitions(String n) {
        int result = 0;
        for (int i = 0; i < n.length(); i++){
            result = Math.max(result, n.charAt(i));
        }
        return result - '0';
    }
}
