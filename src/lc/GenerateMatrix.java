package lc;

public class GenerateMatrix {
    public int[][] generateMatrix(int n){
        int[][] res=new int[n][n];
        int iStart=0,jStart=0;
        int iEnd=n,jEnd=n;

        int count=1;

        if(iEnd==1&&jEnd==1) {
            res[0][0] = count;
            return res;
        }

        while(iEnd>iStart&&jEnd>jStart){
            for(int j=jStart;j<jEnd;j++){
                res[iStart][j]=count++;
            }
            ++iStart;
            if(iEnd>iStart&&jEnd>jStart){
                for(int i=iStart;i<iEnd;i++){
                    res[i][jEnd-1]=count++;
                }
                --jEnd;
            }
            if(iEnd>iStart&&jEnd>jStart){
                for(int j=jEnd-1;j>=jStart;j--){
                    res[iEnd-1][j]=count++;
                }
                --iEnd;
            }
            if(iEnd>iStart&&jEnd>jStart){
                for(int i=iEnd-1;i>=iStart;i--){
                    res[i][jStart]=count++;
                }
                ++jStart;
            }
        }
        return res;
    }
}
