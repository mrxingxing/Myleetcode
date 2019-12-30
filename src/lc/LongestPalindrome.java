package lc;

public class LongestPalindrome {
    public String longestPalindrome(String s) {
        int n=s.length();
        String res="";
        boolean[][] dp=new boolean[n][n];
        for(int i=0;i<n;i++){//double pointer i and j
            for(int j=0;j<=i;j++){
                if (s.charAt(i)==s.charAt(j)&&(i-j<2||dp[j+1][i-1]==true)){
                    dp[j][i]=true;
                }
                if(dp[j][i]==true&&i-j+1>res.length()){
                    res=s.substring(j,i+1);
                }
            }
        }
        return res;
    }
}
