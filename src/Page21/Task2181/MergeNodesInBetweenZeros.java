package Page21.Task2181;

import Page01.Task0169.MajorityElement;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MergeNodesInBetweenZeros {
    public static void main(String[] args) {
        ListNode ex0 = new ListNode(0,new ListNode(2,new ListNode(0,new ListNode(5,new ListNode(2,new ListNode(0))))));
        ListNode ex1 = new ListNode(0,new ListNode(1,new ListNode(0)));
        ListNode ex2 = new ListNode(9,new ListNode(9,new ListNode(0,new ListNode(1))));
        ListNode ex3 = new ListNode(1);

        printListNode(new MergeNodesInBetweenZeros().mergeNodes(ex1));

    }
    public ListNode mergeNodes(ListNode head) {
        ListNode curr = head.next;
        ListNode write = head;
        for (int sum = 0;curr != null;curr = curr.next){
            if (curr.val == 0){
                write = write.next;
                write.val = sum;
                sum = 0;
                continue;
            }
            sum += curr.val;

        }
        write.next = null;
        return head.next;
    }

    public static void printListNode(ListNode head){
        for (;head != null; head = head.next){
            System.out.print(head.val+"-> ");
        }
    }
}
