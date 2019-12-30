package lc;

import java.util.ArrayList;
import java.util.List;

public class KthSmallest {
    List<Integer> arr = new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
        inOrder(root);
        return arr.get(k-1);
    }
    private void inOrder(TreeNode root){
        if(root!=null){
            inOrder(root.left);
            arr.add(root.val);
            inOrder(root.right);
        }
    }
}
