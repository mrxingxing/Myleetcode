package lc;

import java.util.ArrayList;
import java.util.List;

public class PathSum2 {
    List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<Integer> ans=new ArrayList<>();
        pathSum(root,sum,ans);
        return res;
    }
    public void pathSum(TreeNode root,int sum,List<Integer> ans){
        if(root==null)return;
        sum-=root.val;
        ans.add(root.val);
        if(root.left==null&&root.right==null&&sum==0){
            res.add(new ArrayList<>(ans));
        }
        pathSum(root.left,sum,new ArrayList<>(ans));
        pathSum(root.right,sum,new ArrayList<>(ans));
    }
}
