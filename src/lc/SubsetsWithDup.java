package lc;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class SubsetsWithDup {
    List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        if(nums==null||nums.length==0)return res;
        Arrays.sort(nums);
        List<Integer> ans=new ArrayList<>();
        backTrack(ans,nums,0);
        return res;
    }
    private void backTrack(List<Integer> ans,int[] nums,int start){
        if(!res.contains(ans)){
            res.add(new ArrayList<>(ans));
        }
        for(int j=start;j<nums.length;j++){
            ans.add(nums[j]);
            backTrack(ans,nums,j+1);
            ans.remove(ans.size()-1);
        }
    }
}
