package lc;

public class MincutPalindrome {
    public int minCut(String s) {
        int n=s.length();
        boolean[][] dp = new boolean[n][n];
        int[] mincut = new int[n];
        for(int i=0;i<n;i++){
            mincut[i]=i;
            for(int j=0;j<=i;j++) {
                if (s.charAt(i) == s.charAt(j) && (i - j < 2 || dp[j + 1][i - 1] == true)) {
                    dp[j][i]=true;
                    if(j==0){
                        mincut[i]=0;
                    }else{
                        mincut[i]=Math.min(mincut[i],mincut[j-1]+1);
                    }
                }
            }
        }
        return mincut[n-1];
    }
}
