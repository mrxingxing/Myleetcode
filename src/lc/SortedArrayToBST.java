package lc;

public class SortedArrayToBST {
    public TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBST(nums,0,nums.length-1);
    }
    public TreeNode sortedArrayToBST(int[] nums,int start,int end){
        if(start>end){
            return null;
        }
        TreeNode root=new TreeNode(nums[(start+end)/2]);
        root.left=sortedArrayToBST(nums,start,(start+end)/2-1);
        root.right=sortedArrayToBST(nums,(start+end)/2+1,end);
        return root;
    }
}
