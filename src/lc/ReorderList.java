package lc;

import java.util.Stack;

public class ReorderList {
    public void reorderList(ListNode head) {
        if(head==null)return;
        Stack<ListNode> stack = new Stack<>();
        ListNode p=head;
        while(p!=null){
            stack.push(p);
            p=p.next;
        }
        p=head;
        int len=stack.size();
        for(int i=0;i<len/2;i++){
           ListNode next=p.next;
           p.next=stack.pop();
           p.next.next=next;
           p=next;
        }
        p.next=null;
    }
}
