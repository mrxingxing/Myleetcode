package lc;

import java.util.Stack;

public class InsertionSortList {
    public ListNode insertionSortList(ListNode head) {
        ListNode dummy = new ListNode(-1);
        while(head!=null){
            ListNode next=head.next;
            ListNode cur=dummy;
            while(cur.next!=null&&cur.next.val<head.val){
                cur=cur.next;
            }
            head.next=cur.next;
            cur.next=head;
            head=next;
        }
        return dummy.next;
    }
}
