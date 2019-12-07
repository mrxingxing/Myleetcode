package lc;

public class NumDecodings {
    public int numDecodings(String s) {
        if(s==null||s.length()==0){
            return 0;
        }
        int[] dp=new int[s.length()+1];
        dp[s.length()]=1;
        if(s.charAt(s.length()-1)=='0'){
            dp[s.length()-1]=0;
        }else{
            dp[s.length()-1]=1;
        }
        for(int i=s.length()-2;i>=0;i--){
            if(s.charAt(i)=='0'){
                dp[i]=0;
                continue;
            }else if((s.charAt(i)-'0')*10+(s.charAt(i+1)-'0')<=26){
                dp[i]=dp[i+1]+dp[i+2];
            }else{
                dp[i]=dp[i+1];
            }
        }
        return dp[0];
    }
}
