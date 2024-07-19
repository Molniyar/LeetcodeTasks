package Page02.Task0206;

import Page02.Task0226.TreeNode;

public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode test0 = new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5)))));
        System.out.println(listNodeToString(test0));
        System.out.println(listNodeToString(new ReverseLinkedList().reverseList(test0)));
    }
    public ListNode reverseList(ListNode head) {
        if (head == null){return head;}

        ListNode previous = null;
        ListNode next     = head.next;

        while (next != null) {
            head.next = previous;

            previous = head;
            head = next;
            next = next.next;
        }

        head.next = previous;

        return head;
    }
    public static String listNodeToString(ListNode node){
        StringBuilder res = new StringBuilder();
        for (;node!=null;){
            res.append(" ");
            res.append(node.val);
            res.append("->");

            node = node.next;
        }

        return res.toString();
    }

}
