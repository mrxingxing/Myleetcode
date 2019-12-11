package lc;

import java.util.LinkedList;
import java.util.Queue;

public class ConnectNode {
    static class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }
    public Node connect(Node root) {
        if(root==null)return root;
        Queue<Node> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int cul=queue.size();
            for(int i=0;i<cul;i++){
                Node temp=queue.poll();
                if(i!=cul-1){
                    temp.next=queue.peek();
                }else{
                    temp.next=null;
                }
                if(temp.left!=null){
                    queue.offer(temp.left);
                }
                if(temp.right!=null){
                    queue.offer(temp.right);
                }
            }
        }
        return root;
    }
}
