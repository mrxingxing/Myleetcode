package lc;

import java.util.LinkedList;
import java.util.Queue;

public class HasPathSum {
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root==null)return false;
        return bfs(root,sum);
    }
    public boolean bfs(TreeNode root,int sum){
        Queue<TreeNode> queue = new LinkedList<>();
        Queue<Integer> queue2= new LinkedList<>();
        queue.offer(root);
        queue2.offer(sum);
        while(!queue.isEmpty()){
            int cul=queue.size();
            for(int i=0;i<cul;i++){
                TreeNode temp=queue.poll();
                int temp2=queue2.poll();
                if(temp.left==null&&temp.right==null&&temp2-temp.val==0){
                    return true;
                }
                if(temp.left!=null){
                    queue.offer(temp.left);
                    queue2.offer(temp2-temp.val);
                }
                if(temp.right!=null){
                    queue.offer(temp.right);
                    queue2.offer(temp2-temp.val);
                }
            }
        }
        return false;
    }
}
