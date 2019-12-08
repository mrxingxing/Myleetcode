package lc;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ZigzagLevelOrder {
    List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        dfs(root,0);
        return res;
    }
    public void dfs(TreeNode root,int level){
        if(root==null){
            return;
        }
        if(res.size()<=level){
            res.add(new ArrayList<>());
        }
        if(level%2==0){
            res.get(level).add(root.val);
        }else{
            res.get(level).add(0,root.val);
        }
        dfs(root.left,level+1);
        dfs(root.right,level+1);
    }

    public void bfs(TreeNode root){
        if(root==null)return;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        int depth=0;
        while(!queue.isEmpty()){
            List<Integer> ans=new LinkedList<>();
            int cul=queue.size();
            for(int i=0;i<cul;i++){
                TreeNode tmp=queue.poll();
                if(depth%2==0){
                    ans.add(tmp.val);
                }else{
                    ans.add(0,tmp.val);
                }
                if(tmp.left!=null) queue.offer(tmp.left);
                if(tmp.right!=null) queue.offer(tmp.right);
            }
            res.add(ans);
            depth++;
        }
    }
}
