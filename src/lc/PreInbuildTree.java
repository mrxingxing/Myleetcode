package lc;

public class PreInbuildTree {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTree(preorder,0,preorder.length-1,inorder,0,inorder.length-1);
    }
    private TreeNode buildTree(int[] preorder,int p_start,int p_end,int[] inorder,int i_start,int i_end){
        //[3,9,20,15,7]
        //[9,3,15,20,7]
        if(p_start>p_end||i_start>i_end)return null;
        int root_val=preorder[p_start];
        int in_index=-1;
        for(int i=i_start;i<=i_end;i++){
            if(root_val==inorder[i]){
                in_index=i;
                break;
            }
        }
        TreeNode root=new TreeNode(root_val);
        root.left=buildTree(preorder,p_start+1,p_start-i_start+in_index,inorder,i_start,in_index-1);
        root.right=buildTree(preorder,p_start-i_start+in_index+1,p_end,inorder,in_index+1,i_end);
        return root;
    }
}
