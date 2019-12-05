package lc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Permutate {
    List<List<Integer>> res=new ArrayList<>();
    int n;
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        for(int i:nums){
            ans.add(i);
        }
        n=nums.length;
        backTrack(ans, 0);
        return res;
    }

    private void backTrack(List<Integer> ans,int start){
        if(start==n){
            List<Integer> e=new ArrayList<>();
            e.addAll(ans);
            res.add(e);
            return;
        }
        for(int i=start;i<n;i++){
            Collections.swap(ans,start,i);
            backTrack(ans,i+1);
            Collections.swap(ans,start,i);
        }
    }
}
