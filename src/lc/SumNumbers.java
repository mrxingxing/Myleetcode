package lc;

public class SumNumbers {
    int ans=0;
    int temp=0;
    public int sumNumbers(TreeNode root) {
        dfs(root);
        return ans;
    }
    private void dfs(TreeNode root){
        if(root==null)return;
        temp=temp*10+root.val;
        if(root.left==null&&root.right==null){
            ans+=temp;
        }
        dfs(root.left);
        dfs(root.right);
        temp/=10;
    }
}
