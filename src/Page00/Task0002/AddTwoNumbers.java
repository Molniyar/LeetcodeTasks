package Page00.Task0002;

public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode test0_1 = new ListNode(2,new ListNode(4, new ListNode(3)));
        ListNode test0_2 = new ListNode(5,new ListNode(6, new ListNode(4)));

        printListNode(new AddTwoNumbers().addTwoNumbers(test0_1, test0_2));

        test0_1 = new ListNode(2,new ListNode(4));
        test0_2 = new ListNode(5,new ListNode(6, new ListNode(4)));

        printListNode(new AddTwoNumbers().addTwoNumbers(test0_1, test0_2));

        test0_1 = new ListNode(2,new ListNode(4, new ListNode(3)));
        test0_2 = new ListNode(5,new ListNode(6));

        printListNode(new AddTwoNumbers().addTwoNumbers(test0_1, test0_2));

        test0_1 = new ListNode(2,new ListNode(4, new ListNode(6)));
        test0_2 = new ListNode(5,new ListNode(6, new ListNode(4)));

        printListNode(new AddTwoNumbers().addTwoNumbers(test0_1, test0_2));

        test0_1 = new ListNode(2,new ListNode(4));
        test0_2 = new ListNode(5,new ListNode(6, new ListNode(9)));

        printListNode(new AddTwoNumbers().addTwoNumbers(test0_1, test0_2));
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);
        ListNode write = res;

        ListNode r2 = l2;

        int rest = 0;
        for (;l1 != null || l2 != null || rest > 0;){
            int num1 = 0;
            if (l1 != null){num1 = l1.val;}
            int num2 = 0;
            if (l2 != null){num2 = l2.val;}

            int sum = num1 + num2 + rest;
            rest = 0;
            if (sum > 9){
                sum -= 10;
                rest = 1;
            }

            if (l1 != null){
                write.next = l1;
            }
            else {
                write.next = r2;
                r2 = r2.next;
            }
            write.next.val = sum;
            write = write.next;

            if (l1 != null){l1 = l1.next;}
            if (l2 != null){l2 = l2.next;}
        }
        write.next = null;
        return res.next;
    }

    public static void printListNode(ListNode head){
        for (;head != null; head = head.next){
            System.out.print(head.val+"-> ");
        }
        System.out.println();
    }

}
