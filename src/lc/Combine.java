package lc;

import java.util.ArrayList;
import java.util.List;

public class Combine {
    List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        if(n<1||k<1||k>n)return res;
        List<Integer> ans = new ArrayList<>();
        backtrace(n,k,ans,0,1);
        return res;
    }
    private void backtrace(int n,int k,List<Integer> ans,int start,int now){
        if(start==k){
            res.add(new ArrayList<>(ans));
            return;
        }
        for(int i=now;i<=n;i++){
            if(!ans.contains(i)){
                ans.add(i);
                ++start;
            }
            backtrace(n,k,ans,start,i+1);
            --start;
            ans.remove(ans.size()-1);
        }
    }
}
