package Page21.Task2181;

public class MergeNodesInBetweenZeros {
    public static void main(String[] args) {

    }
    public ListNode mergeNodes(ListNode head) {
        ListNode prev=head.next, curr=head.next;
        int sum=0;
        for (; curr!=null; curr=curr.next){
            int x=curr.val;
            if (x!=0) sum+=x;
            else{
                prev.val=sum;
                prev.next=curr.next;
                prev=prev.next;
                sum=0;
            }
        }
        return head.next;
    }

}
