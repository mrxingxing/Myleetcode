package lc;

import java.util.ArrayList;
import java.util.List;

public class IsValidBST {
    public boolean isValidBST(TreeNode root) {
        List<Integer> ans=inorderTraversal(root);
        for(int i=1;i<ans.size();i++){
            if(ans.get(i-1)>=ans.get(i)){
                return false;
            }
        }
        return true;
    }
    private List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        Inorder(root,res);
        return res;
    }
    private void Inorder(TreeNode root,List<Integer> res){
        if(root!=null){
            Inorder(root.left,res);
            res.add(root.val);
            Inorder(root.right,res);
        }
    }
}
