package lc;

public class MaximalSquare {
    public int maximalSquare(char[][] matrix) {
        int row=matrix.length;
        if(row==0)return 0;
        int col=matrix[0].length;
        int[][] dp=new int[row+1][col+1];
        int len=0;
        for (int i = 1; i <row ; i++) {
            for (int j = 1; j <col ; j++) {
                if(matrix[i][j]=='1'){
                    dp[i][j]=getmin(dp[i-1][j-1],dp[i-1][j],dp[i][j-1])+1;
                }
                len=Math.max(len,dp[i][j]);
            }
        }
        return len*len;
    }
    public int getmin(int a,int b,int c){
        return Math.min(Math.min(a,b),c);
    }
}
