package lc;

public class Addtwolink {
	
	static class ListNode{
		int val;
		 ListNode next;
		 ListNode(int x) { val = x; }
	}

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3=new ListNode(0);
        ListNode p=l1,q=l2,r=l3;
        int mark=0;
        while(p!=null||q!=null){
            int a,b;
            if(p!=null){
                a=p.val;
                p=p.next;
            }else{
                a=0;
            }
            if(q!=null){
                b=q.val;
                q=q.next;
            }else{
                b=0;
            }
            r.next=new ListNode((mark+a+b)%10);
            r=r.next;
            mark=(mark+a+b)/10;        
        }
        if(mark>0){
            r.next=new ListNode(mark);
        }
        return l3.next;
    }
}
