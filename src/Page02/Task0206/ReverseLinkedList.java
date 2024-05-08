package Page02.Task0206;

public class ReverseLinkedList {
    public static void main(String[] args) {

    }
    public ListNode reverseList(ListNode head) {
        ListNode result = null;
        for (;;){
            if (head == null){
                break;
            }
            result = new ListNode(head.val,result);
            head = head.next;
        }
        return result;
    }
}
