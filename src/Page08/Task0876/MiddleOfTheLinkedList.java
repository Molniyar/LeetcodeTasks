package Page08.Task0876;

public class MiddleOfTheLinkedList {
    public static void main(String[] args) {

    }
    public ListNode middleNode(ListNode head) {
        ListNode keep = null;
        keep = head;

        int length = 0;
        while (keep != null){
            length++;
            keep = keep.next;
        }

        for (int i = 0; i < length/2; i++){
            head = head.next;
        }

        return head;
    }
}
