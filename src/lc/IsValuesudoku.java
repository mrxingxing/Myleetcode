package lc;


public class IsValuesudoku {
	public boolean isValidSudoku(char[][] board) {
        int row=board.length;
        int col=board[0].length;

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(board[i][j]!='.'){
                    int a=3*(i/3);
                    int b=3*(j/3);
                    for(int m=a;m<a+3;m++){
                        for(int n=b;n<b+3;n++){
                            if(board[i][j]==board[m][n]&&(i!=m||j!=n)){
                                return false;
                            }
                        }
                    }
                    for(int m=0;m<row;m++){
                        if(board[i][j]==board[m][j]&&m!=i){
                            System.out.printf(i+" "+j+"row");
                            return false;
                        }
                    }
                    for(int n=0;n<col;n++){
                        if(board[i][j]==board[i][n]&&j!=n){
                            System.out.printf(i+" "+j+"col");
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}
