package lc;

public class DetectCycle {
    public ListNode detectCycle(ListNode head) {
        ListNode detectNode=hasCycle(head);
        if(detectNode==null)return null;
        while(head!=detectNode){
            head=head.next;
            detectNode=detectNode.next;
        }
        return detectNode;
    }
    public ListNode hasCycle(ListNode head) {
        if(null==head||null==head.next)return null;
        ListNode slow=head,fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return slow;
            }
        }
        return null;
    }
}
