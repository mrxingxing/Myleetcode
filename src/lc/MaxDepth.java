package lc;

public class MaxDepth {
    int max=0;
    public int maxDepth(TreeNode root) {
        maxDepth(root,0);
        return max;
    }
    private void maxDepth(TreeNode root,int depth){
        if(root!=null){
            maxDepth(root.left,depth+1);
            maxDepth(root.right,depth+1);
        }
        max=Math.max(max,depth);
    }
}
