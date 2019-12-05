package lc;

public class Deleteduplicate {
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null)return head;
        if(head!=null&&head.next!=null&&head.val==head.next.val){
            while(head!=null&&head.next!=null&&head.val==head.next.val){
                head=head.next;
            }
            return deleteDuplicates(head.next);
        }else{
            head.next=deleteDuplicates(head.next);
        }
        return head;
    }
}
