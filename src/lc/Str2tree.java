package lc;

import java.util.Stack;

public class Str2tree {
    public TreeNode str2tree(String s) {
        if(s.length()==0)return null;
        Stack<TreeNode> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==')'){
                stack.pop();
            }else if(s.charAt(i)=='-'||s.charAt(i)>='0'&&s.charAt(i)<='9'){
                int j=i;
                while(j<s.length()-1&&s.charAt(j+1)>='0'&&s.charAt(j+1)<='9'){
                    j++;
                }
                System.out.println(Integer.valueOf(s.substring(i,j+1)));
                TreeNode node = new TreeNode(Integer.valueOf(s.substring(i,j+1)));
                i=j;//在for循环结束后i自增
                if(!stack.isEmpty()){
                    TreeNode parent=stack.peek();
                    if(parent.left==null){
                        parent.left=node;
                    }else {
                        parent.right=node;
                    }
                }
                stack.push(node);
            }
        }
        if(stack.isEmpty())return null;
        else return stack.pop();
    }

}
