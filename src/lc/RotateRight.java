package lc;

public class RotateRight {
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int x){ val=x; }
    }

    public ListNode rotateRight(ListNode head,int k){
        if(head==null||head.next==null) {return head;}
        ListNode pre,nxt;
        int n=0;

        int len=0;
        ListNode p=head;
        while(p!=null){
            ++len;
            p=p.next;
        }
        while(n<k%len){
            pre=head;
            nxt=pre.next;
            while(nxt.next!=null){
                pre=pre.next;
                nxt=pre.next;
            }
            pre.next=null;
            nxt.next=head;
            head=nxt;
            ++n;
        }
        return head;
    }


}
