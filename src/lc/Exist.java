package lc;

public class Exist {
    int[][] direction={{-1,0},{0,-1},{1,0},{0,1}};
    int row,col;
    boolean[][] mark;
    public boolean exist(char[][] board, String word) {
        if(word==null||word.length()==0)return true;
        row=board.length;
        col=board[0].length;
        mark=new boolean[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(dfs(0,i,j,board,word)){
                    return true;
                }
            }
        }
        return false;
    }
    private boolean dfs(int start,int nowX,int nowY,char[][] board,String word){
        if(start==word.length()-1){
            return board[nowX][nowY]==word.charAt(start);
        }
        if(board[nowX][nowY]==word.charAt(start)){
            mark[nowX][nowY]=true;
            for(int i=0;i<4;i++){
                int newX=nowX+direction[i][0];
                int newY=nowY+direction[i][1];
                if(isArea(newX,newY,board)&&!mark[newX][newY]){
                    if(dfs(start+1,newX,newY,board,word)){
                        return true;
                    }
                }
            }
            mark[nowX][nowY]=false;
        }
        return false;
    }
    private boolean isArea(int x,int y,char[][] board){
        return x>=0&&x<board.length&&y>=0&&y<board[0].length;
    }
}
