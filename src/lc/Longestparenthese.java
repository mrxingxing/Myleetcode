package lc;

public class Longestparenthese {
	public int longestValidParentheses(String s) {
        if(s.equals(null)||s.equals("")||s.length()==1)return 0;
        int[] dp=new int[s.length()];
        dp[0]=0;
        int i=0,j=i+1;
        while(i<s.length()&&j<s.length()){
            if(s.charAt(i)=='('){
                while(j<s.length()&&s.charAt(j)!=')'){
                    dp[j]=dp[j-1];
                    ++j;
                }
                if(j<s.length()){
                    dp[j]=dp[j-1]+2;
                    i=j+1;
                    if(i<s.length()) {
                        dp[i]=dp[i-1];
                    }
                    j=i+1;
                }
            }else{
                ++i;
                ++j;
                dp[i]=dp[i-1];
            }
        }
        for(int a:dp) {
        	System.out.print(a+" ");
        }
        return dp[s.length()-1];
    }
	
	public static void main (String[] args) {
		Longestparenthese l=new Longestparenthese();
		l.longestValidParentheses(")()())");
	}
}
