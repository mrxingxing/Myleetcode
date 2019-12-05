package lc;

public class UniquePath2 {
	public int uniquePathsWithObstacles(int[][] obstacleGrid) {
		if(obstacleGrid[0][0]==1)return 0;
        int row=obstacleGrid.length;
        int col=obstacleGrid[0].length;
        
        System.out.println(row);
        
        System.out.println(col);
        
        int[][] dp=new int[row][col];
        dp[0][0]=0;
        boolean isblocked=false;
        for(int i=1;i<col;i++) {
        	if(!isblocked&&obstacleGrid[0][i]!=1) {
        		dp[0][i]=1;
        	}else {
        		isblocked=true;
        		dp[0][i]=0;
        	}
        }
        isblocked=false;

        for(int i=1;i<row;i++) {
        	if(!isblocked&&obstacleGrid[i][0]!=1) {
        		dp[i][0]=1;
        	}else {
        		isblocked=true;
        		dp[i][0]=0;
        	}
        }
        for(int i=1;i<row;i++) {
        	for(int j=1;j<col;j++) {
        		if(obstacleGrid[i][j]==1) {
        			dp[i][j]=0;
        		}else {
        			dp[i][j]=dp[i-1][j]+dp[i][j-1];
        		}
        	}
        }
        System.out.println(dp[row-1][col-1]);
        return dp[row-1][col-1];
    }
	
	public static void main(String[] args) {
		//int[][] t= {{0,0,0},{0,1,0},{0,0,0},{0,0,0}};
		int[][] t= {{0}};
		UniquePath2 u=new UniquePath2();
		u.uniquePathsWithObstacles(t);
	}
}
