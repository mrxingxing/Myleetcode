package lc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class GetPermutation {
    List<List<Integer>> res=new ArrayList<>();
    int n;
    public String getPermutation(int m,int k){
        int[] nums=new int[m];
        for(int i=1;i<=m;i++){
            nums[i-1]=i;
        }
        permute(nums);
        Collections.sort(res,new Comparator<List<Integer>>(){
            @Override
            public int compare(List<Integer> o1, List<Integer> o2) {
                for(int i=0;i<o1.size();i++){
                    if(o1.get(i)!=o2.get(i))
                        return o1.get(i)-o2.get(i);
                }
                return 0;
            }
        });

        for(int i=0;i<res.size();i++){
            System.out.println(String.valueOf(res.get(i)));
        }

        StringBuffer sb=new StringBuffer();
        for(int i:res.get(k-1)){
            sb.append(i);
        }

        return sb.toString();

    }
    private List<List<Integer>> permute(int[] nums) {
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
            res.add(new ArrayList<>(ans));
            return;
        }
        for(int i=start;i<n;i++){
            Collections.swap(ans,start,i);
            backTrack(ans,start+1);
            Collections.swap(ans,start,i);
        }
    }
}
