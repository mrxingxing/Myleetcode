package lc;

import java.util.ArrayList;
import java.util.List;

public class Subset {
    List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        if(nums==null||nums.length==0)return res;
        List<Integer> ans=new ArrayList<>();
        backtrack(0,nums,ans);
        return res;
    }
    private void backtrack(int i,int[] nums,List<Integer> ans){
        res.add(new ArrayList<>(ans));
        for(int j=i;j<nums.length;j++){
            ans.add(nums[j]);
            backtrack(j+1,nums,ans);
            ans.remove(ans.size()-1);
        }
    }
}
