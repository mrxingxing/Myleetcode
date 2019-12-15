package lc;

import java.util.List;

public class MinimumTotal {
    public int minimumTotal(List<List<Integer>> triangle) {
        int sz=triangle.size();
        int[] dp=new int[sz];
        for(int i=0;i<sz;i++)dp[i]=triangle.get(sz-1).get(i);
        for(int i=sz-2;i>=0;i--){
            for(int j=0;j<=i;j++){
                dp[j]=Math.min(dp[j],dp[j+1])+triangle.get(i).get(j);
            }
        }
        return dp[0];
    }
}
