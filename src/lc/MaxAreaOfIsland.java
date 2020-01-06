package lc;

public class MaxAreaOfIsland {
    int maxArea=0;
    boolean[][] isvisited;
    public int maxAreaOfIsland(int[][] grid) {
        int row=grid.length;
        if(row<1)return maxArea;
        int col=grid[0].length;
        isvisited=new boolean[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int curMax=getMaxArea(grid,i,j);
                maxArea=Math.max(curMax,maxArea);
            }
        }
        return maxArea;
    }
    public int getMaxArea(int[][] grid,int i,int j){
        if(i<0||i>grid.length-1||j<0||j>grid[0].length-1||isvisited[i][j]||grid[i][j]==0){
            return 0;
        }
        isvisited[i][j]=true;
        return 1+getMaxArea(grid,i+1,j)+getMaxArea(grid,i-1,j)+getMaxArea(grid,i,j+1)+getMaxArea(grid,i,j-1);
    }
}
