package lc;

import java.util.ArrayList;
import java.util.List;

public class GenerateTrees {
    public List<TreeNode> generateTrees(int n) {
        return generateTrees(1,n+1);
    }
    private List<TreeNode> generateTrees(int begin,int end){
        List<TreeNode> ans,left,right;
        TreeNode root;

        ans=new ArrayList<>();
        if(begin==end){
            return ans;
        }
        for(int i=begin;i<end;i++){
            left=generateTrees(begin,i);
            right=generateTrees(i+1,end);
            if(left.size()==0&&right.size()==0) {
                root = new TreeNode(i);
                ans.add(root);
            }else if(left.size()==0){
                for(int j=0;j<right.size();j++){
                    root=new TreeNode(i);
                    root.right=right.get(j);
                    ans.add(root);
                }
            }else if(right.size()==0){
                for(int j=0;j<left.size();j++){
                    root=new TreeNode(i);
                    root.left=left.get(j);
                    ans.add(root);
                }
            }else{
                for(int j=0;j<left.size();j++){
                    for(int k=0;k<right.size();k++){
                        root=new TreeNode(i);
                        root.right=right.get(k);
                        root.left=left.get(j);
                        ans.add(root);
                    }
                }
            }
        }
        return ans;
    }

}
