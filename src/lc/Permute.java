package lc;

import java.util.ArrayList;
import java.util.List;

public class Permute {
	List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        backTrack(nums, ans, 0);
        return res;
    }

    private void backTrack(int[] nums,List<Integer> ans,int start){
        if(ans.size()==nums.length) {
            List<Integer> e=new ArrayList<>();
            e.addAll(ans);
            res.add(e);
            return;
        }
        while(ans.size()<nums.length) {
        	if(!ans.contains(nums[start])) {
        		ans.add(nums[start]);
        	}
        	start=(start+1)%3;
        	backTrack(nums, ans, start);
        	ans.remove(ans.size()-1);
        }
    }
}

