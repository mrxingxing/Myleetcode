package lc;

import java.util.ArrayList;
import java.util.List;

public class SpiralOrder {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res=new ArrayList<>();

        int iStart=0,jStart=0;
        if(matrix==null||matrix.length==0||(matrix.length==1&&matrix[0].length==0)){
            return res;
        }
        int iEnd=matrix.length,jEnd=matrix[0].length;


        if(iEnd==1&&jEnd==1){
            for(int i:matrix[0]){
                res.add(i);
            }
            return res;
        }

        while(iEnd>iStart&&jEnd>jStart){
            for(int j=jStart;j<jEnd;j++){
                res.add(matrix[iStart][j]);
            }
            ++iStart;
            if(iEnd>iStart&&jEnd>jStart){
                for(int i=iStart;i<iEnd;i++){
                    res.add(matrix[i][jEnd-1]);
                }
                --jEnd;
            }
            if(iEnd>iStart&&jEnd>jStart){
                for(int j=jEnd-1;j>=jStart;j--){
                    res.add(matrix[iEnd-1][j]);
                }
                --iEnd;
            }
            if(iEnd>iStart&&jEnd>jStart){
                for(int i=iEnd-1;i>=iStart;i--){
                    res.add(matrix[i][jStart]);
                }
                ++jStart;
            }
        }

        return res;
    }
}
