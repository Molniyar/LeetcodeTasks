package Page08.Task0876;

public class MiddleOfTheLinkedList {
    public static void main(String[] args) {

    }
    public ListNode middleNode(ListNode head) {
        ListNode fast = head;

        for (;fast != null && fast.next!=null;){
            head = head.next;
            fast = fast.next.next;
        }

        return head;
    }
}
