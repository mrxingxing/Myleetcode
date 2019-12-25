package lc;

import java.util.Arrays;

public class NumIslands {
    int[] h1={1,0,-1,0};
    int[] h2={0,1,0,-1};
    int num=0;
    boolean[][] mark;
    public int numIslands(char[][] grid) {
        int row=grid.length;
        if(row==0)return 0;
        int col=grid[0].length;
        mark=new boolean[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]=='1'&&mark[i][j]==false){
                    dfs(grid,i,j);
                    num++;
                }
            }
        }
        return num;
    }
    public void dfs(char[][] grid,int row,int col){
        if(grid[row][col]=='1'&&mark[row][col]==false){
            mark[row][col]=true;
            for(int i=0;i<4;i++){
                if(row+h1[i]>=0&&row+h1[i]<grid.length&&col+h2[i]<grid[0].length&&col+h2[i]>=0&&grid[row+h1[i]][col+h2[i]]=='1'&&mark[row+h1[i]][col+h2[i]]==false){
                    System.out.println("row:"+row+" "+"cow"+col);
                    dfs(grid,row+h1[i],col+h2[i]);
                }
            }
        }
    }
}
