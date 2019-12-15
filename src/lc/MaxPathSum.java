package lc;

public class MaxPathSum {
    int max=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        backTrack(root);
        return max;
    }
    public int backTrack(TreeNode root){
        if(root==null) return 0;
        int leftValue=Math.max(backTrack(root.left),0);
        int rightValue=Math.max(backTrack(root.right),0);

        max=Math.max(max,root.val+leftValue+rightValue);
        return root.val+Math.max(leftValue,rightValue);
    }
}
