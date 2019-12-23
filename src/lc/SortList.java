package lc;

public class SortList {
    public ListNode sortList(ListNode head) {
        if(head==null)return head;
        return mergeSort(head);
    }
    public ListNode mergeSort(ListNode head){
        if(head.next==null){
            return head;
        }
        ListNode slow=head,fast=head.next;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        fast=slow.next;
        slow.next=null;
        head=mergeSort(head);
        fast=mergeSort(fast);
        ListNode res = merge(head,fast);
        return res;
    }
    public ListNode merge(ListNode left,ListNode right){
        ListNode res;
        if (left.val < right.val) {
            res=left;
            left=left.next;
        }else{
            res=right;
            right=right.next;
        }
        ListNode temp=res;
        while(left!=null&&right!=null){
            if(left.val<right.val) {
                temp.next = left;
                temp = temp.next;
                left = left.next;
            }else{
                temp.next=right;
                temp=temp.next;
                right=right.next;
            }
        }
        if(left!=null)temp.next=left;
        if(right!=null)temp.next=right;
        if(left==null&&right==null){
            temp.next=null;
        }
        return res;

    }
}
