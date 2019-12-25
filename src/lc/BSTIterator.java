package lc;

import java.util.LinkedList;
import java.util.Queue;

public class BSTIterator {
    Queue<Integer> queue=new LinkedList<>();
    private void inOrder(TreeNode root){
        if(root!=null){
            inOrder(root.left);
            queue.offer(root.val);
            inOrder(root.right);
        }
    }
    public BSTIterator(TreeNode root) {
        inOrder(root);
    }

    /** @return the next smallest number */
    public int next() {
        return queue.poll();
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !queue.isEmpty();
    }

}
