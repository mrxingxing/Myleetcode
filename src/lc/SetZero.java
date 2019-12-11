package lc;

import java.util.ArrayList;
import java.util.List;

public class SetZero {
    public void setZeroes(int[][] matrix){
        List<Integer[]> mk=new ArrayList<>();
        int row=matrix.length;
        int col=matrix[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]==0){
                    Integer[] ans=new Integer[2];
                    ans[0]=i;
                    ans[1]=j;
                    mk.add(ans);
                }
            }
        }
        for(Integer[] tmp:mk){
            for(int j=0;j<col;j++){
                matrix[tmp[0]][j]=0;
            }
            for(int i=0;i<row;i++){
                matrix[i][tmp[1]]=0;
            }
        }
    }
}
