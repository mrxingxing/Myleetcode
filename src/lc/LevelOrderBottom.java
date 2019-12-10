package lc;

import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
import java.util.Queue;

public class LevelOrderBottom {
    List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        bfs(root);
        return res;
    }
    public void bfs(TreeNode root){
        if(root==null)return;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            List<Integer> ans=new LinkedList<>();
            int cul=queue.size();
            for(int i=0;i<cul;i++){
                TreeNode tmp=queue.poll();
                ans.add(tmp.val);
                if(tmp.left!=null) queue.offer(tmp.left);
                if(tmp.right!=null) queue.offer(tmp.right);
            }
            res.add(0,ans);
        }
    }
}
