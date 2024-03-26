package Page00.Task0083;



public class RemoveDuplicatesFromSortedList {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static void printListNode(ListNode list) {
        String out = "[";
        for (;true;list = list.next){
            out = out + list.val;
            if (list.next == null){
                break;
            }
            out = out + ", ";
        }
        out = out + "]";
        System.out.println(out);
    }
    public static void main(String[] args) {
        ListNode test  = new ListNode(2, new ListNode(2, new ListNode(4, new ListNode(6,  new ListNode(6)))));
        ListNode test1 = new ListNode(2, new ListNode(6,  new ListNode(6, new ListNode(6))));
        ListNode test2 = new ListNode();
        printListNode(new RemoveDuplicatesFromSortedList().deleteDuplicates(test));
        printListNode(new RemoveDuplicatesFromSortedList().deleteDuplicates(test1));
    }
    public ListNode deleteDuplicates(ListNode head) {
        ListNode item = head;

        for (;true;){
            if (item == null || item.next == null){
                break;
            }

            if (item.val == item.next.val){
                item.next = item.next.next;
            }
            else item = item.next;

        }
        return head;
    }
}
