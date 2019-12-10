package lc;

import java.util.LinkedList;
import java.util.Queue;

public class MinDepth {
    public int minDepth(TreeNode root) {
        if(root==null)return 0;
        return bfs(root);
    }
    public int bfs(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int count=1;
        while(!queue.isEmpty()){
            int cul=queue.size();
            for(int i=0;i<cul;i++){
                TreeNode temp=queue.poll();
                if(temp.left==null&&temp.right==null){
                    return count;
                }
                if(temp.left!=null)queue.offer(temp.left);
                if(temp.right!=null)queue.offer(temp.right);
            }
            count++;
        }
        return count;
    }
}
