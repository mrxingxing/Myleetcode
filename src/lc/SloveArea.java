package lc;

public class SloveArea {
    boolean flag[][];
    int[] m1={1,0,-1,0};
    int[] m2={0,1,0,-1};
    public void solve(char[][] board) {
        int row=board.length;
        if(row<3)return;
        int col=board[0].length;
        flag=new boolean[row][col];
        int i=0,j=0,a=0,b=0,d=0;
        int total = 2 * (row + col) - 4;
        for(int k = 1; k <= total; k++){
            if(board[i][j] == 'O')
                dfs(i, j, row, col, board);
            a = i + m1[d];
            b = j + m2[d];
            if(a >= row || a < 0 || b >= col || b < 0){
                d = (d + 1) % 4;
                a = i + m1[d];
                b = j + m2[d];
            }
            i = a;
            j = b;
        }
        for(int p = 0; p < row; p++)
            for(int q = 0; q < col; q++) {
                if (!flag[p][q])
                    board[p][q] = 'X';
            }
    }
    public void dfs(int x,int y,int row,int col,char[][] board){
        flag[x][y]=true;
        for(int i=0;i<4;i++){
            int a=x+m1[i];
            int b=y+m2[i];
            if(a>=0&&a<row&&b>=0&&b<col&&board[a][b]=='O'&&flag[a][b]==false){
                dfs(a,b,row,col,board);
            }
        }
    }
}
