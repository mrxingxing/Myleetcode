package lc;

import java.util.*;

public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        levelOrder(root,sb);
        return sb.substring(0,sb.length()-1);
    }

    private void levelOrder(TreeNode root,StringBuilder sb){
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int sz=queue.size();
            for (int i = 0; i < sz; i++) {
                TreeNode temp=queue.poll();
                if(temp==null){
                    sb.append("null,");
                }else{
                    sb.append(temp.val);
                    sb.append(",");
                    queue.offer(temp.left);
                    queue.offer(temp.right);
                }
            }
        }
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] str=data.split(",");
        List<String> list = new LinkedList<>(Arrays.asList(str));
        return deser(list);
    }

    private TreeNode deser(List<String> list){
        if(list.get(0).equals("null")){
            list.remove(0);
            return null;
        }
        TreeNode res=new TreeNode(Integer.valueOf(list.get(0)));
        list.remove(0);
        res.left=deser(list);
        res.right=deser(list);
        return res;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.right.left=new TreeNode(4);
        root.right.right=new TreeNode(5);
        Codec c = new Codec();
        System.out.println(c.serialize(root));
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));
