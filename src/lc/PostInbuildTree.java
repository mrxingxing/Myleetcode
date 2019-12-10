package lc;

public class PostInbuildTree {
    public TreeNode buildTree(int[] inorder,int[] postorder) {
        return buildTree(inorder,0,inorder.length-1,postorder,0,postorder.length-1);
    }

    private TreeNode buildTree(int[] inorder, int i_start, int i_end, int[] postorder, int p_start, int p_end) {
        //[9,3,15,20,7]
        //[9,15,7,20,3]
        if(p_start>p_end||i_start>i_end){
            return null;
        }
        int root_val=postorder[p_end];
        int in_index=-1;
        for(int i=i_start;i<=i_end;i++){
            if(root_val==inorder[i]){
                in_index=i;
                break;
            }
        }
        TreeNode root=new TreeNode(root_val);
        root.left=buildTree(inorder,i_start,in_index-1,postorder,p_start,p_end-i_end+in_index-1);
        root.right=buildTree(inorder,in_index+1,i_end,postorder,p_end-i_end+in_index,p_end-1);
        return root;
    }
}
