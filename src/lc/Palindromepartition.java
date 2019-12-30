package lc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Palindromepartition {
    List<List<String>> res = new ArrayList<>();
    public List<List<String>> partition(String s) {
        int n=s.length();
        boolean[][] dp = new boolean[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                if(s.charAt(i)==s.charAt(j)&&(i-j<2||dp[j+1][i-1]==true)){
                    dp[j][i]=true;
                }
            }
        }
        //System.out.println(Arrays.deepToString(dp));
        dfs(new ArrayList<>(),0,n,dp,s);
        return res;
    }
    public void dfs(List<String> ans,int i,int n,boolean[][] dp,String s){
        if(i==n){
            res.add(new ArrayList<>(ans));
        }
        for(int j=i;j<n;j++){
            if(dp[i][j]==true){
                ans.add(s.substring(i,j+1));
                dfs(ans,j+1,n,dp,s);
                ans.remove(ans.size()-1);
            }
        }
    }
}
