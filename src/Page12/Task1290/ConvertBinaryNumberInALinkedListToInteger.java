package Page12.Task1290;

public class ConvertBinaryNumberInALinkedListToInteger {
    public static void main(String[] args) {

    }
    public int getDecimalValue(ListNode head) {
        int res = 0;
        while (head != null) {
            res <<= 1;
            res+=head.val;
             head = head.next;
        }
        return res;
    }
}
