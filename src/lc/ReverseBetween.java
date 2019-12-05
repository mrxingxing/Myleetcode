package lc;

import java.util.Stack;

public class ReverseBetween {
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode reverseBetween(ListNode head, int m, int n) {
        Stack<ListNode> stack=new Stack<>();
        ListNode start=null;
        ListNode res=head;
        for(int i=1;i<m;i++){
            start=head;
            head=head.next;
        }
        for(int i=0;i<=n-m;i++){
            stack.push(head);
            head=head.next;
        }
        ListNode end=head;
        //System.out.println(end.val);
        if(start!=null){
            while(!stack.empty()){
                start.next=stack.pop();
                start=start.next;
            }
            start.next=end;
            return res;
        }else{
            res=stack.peek();
            start=stack.pop();
            while(!stack.empty()){
                start.next=stack.pop();
                start=start.next;
            }
            start.next=end;
            return res;
        }
    }
}
