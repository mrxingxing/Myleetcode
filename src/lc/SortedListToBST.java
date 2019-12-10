package lc;

import java.util.ArrayList;
import java.util.List;

public class SortedListToBST {

    public TreeNode sortedListToBST(ListNode head) {
        List<Integer> ans=new ArrayList<>();
        while(head!=null){
            ans.add(head.val);
            head=head.next;
        }
        Integer[] res=ans.toArray(new Integer[ans.size()]);
        return sortedArrayToBST(res,0,ans.size()-1);
    }
    public TreeNode sortedArrayToBST(Integer[] nums,int start,int end){
        if(start>end){
            return null;
        }
        TreeNode root=new TreeNode(nums[(start+end)/2]);
        root.left=sortedArrayToBST(nums,start,(start+end)/2-1);
        root.right=sortedArrayToBST(nums,(start+end)/2+1,end);
        return root;
    }

}
