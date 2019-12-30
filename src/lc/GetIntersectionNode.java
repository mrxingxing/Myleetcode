package lc;

public class GetIntersectionNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null||headB==null)return null;
        ListNode a=headA;
        int countA=0;
        ListNode b=headB;
        int countB=0;
        while(a!=null){
            countA++;
            a=a.next;
        }
        while(b!=null){
            countB++;
            b=b.next;
        }

        if(countA>countB){
            int p=countA-countB;
            while(p>0){
                headA=headA.next;
                p--;
            }
        }else{
            int p=countB-countA;
            while(p>0){
                headB=headB.next;
                p--;
            }
        }
        while(headA!=null){
            if(headA==headB){
                return headA;
            }
            headA=headA.next;
            headB=headB.next;
        }
        return null;
    }
}
