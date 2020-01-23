package lc;

public class Tree2str {
    StringBuilder sb = new StringBuilder();
    public String tree2str(TreeNode t) {
        if(t==null)return "";
        dfs(t);
        return sb.substring(1,sb.length()-1);
    }
    public void dfs(TreeNode t){
        if(t==null){
            return;
        }
        sb.append('(');
        sb.append(t.val);
        System.out.println('('+t.val);
        if(t.left==null&&t.right!=null){
            sb.append("()");
        }
        dfs(t.left);
        dfs(t.right);
        sb.append(')');
    }
}
