package lc;

import java.util.ArrayList;
import java.util.List;

public class InorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
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
